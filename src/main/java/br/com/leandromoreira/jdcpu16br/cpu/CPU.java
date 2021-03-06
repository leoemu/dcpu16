package br.com.leandromoreira.jdcpu16br.cpu;

import br.com.leandromoreira.jdcpu16br.misc.HexadecimalUtil;
import br.com.leandromoreira.jdcpu16br.io.Memory;

public class CPU {

    public static final int A = 0x0;
    public static final int B = 0x1;
    public static final int C = 0x2;
    public static final int X = 0x3;
    public static final int Y = 0x4;
    public static final int Z = 0x5;
    public static final int I = 0x6;
    public static final int J = 0x7;
    private final HexadecimalUtil formatter;
    private int[] register;
    private int programCounter, stackPointer;
    private int overflow;
    private final Instruction[] instructions;
    private final ParameterDecoder[] decoders;
    private final Memory memory;
    private ParameterDecoder a, b;
    private Word currentWord;
    private Instruction currentInstruction;
    private int currentCycleCost;

    public CPU() {
        formatter = new HexadecimalUtil();
        memory = new Memory();
        instructions = new InstructionTable().instructionSet(this);
        decoders = new AllParametersDecoder(this).all();
        reset();
    }

    public final void reset() {
        stackPointer = 0xFFFF;
        programCounter = overflow = 0x0000;
        register = new int[0x8];
        memory.clear();
    }

    public Instruction[] getInstructions() {
        return instructions;
    }

    public Word getCurrentWord() {
        return currentWord;
    }

    public ParameterDecoder parameterA() {
        return a;
    }

    public ParameterDecoder parameterB() {
        return b;
    }

    public Memory memory() {
        return memory;
    }

    public int getOverflow() {
        return overflow;
    }

    public void setOverflow(final int overflow) {
        this.overflow = overflow;
    }

    public int getProgramCounter() {
        return programCounter;
    }

    public void setProgramCounter(final int programCounter) {
        this.programCounter = programCounter;
    }

    public int getStackPointer() {
        return stackPointer;
    }

    public int popStackPointer() {
        return stackPointer++;
    }

    public int pushStackPointer() {
        return --stackPointer;
    }

    public void setStackPointer(final int stackPointer) {
        this.stackPointer = stackPointer;
    }

    public int register(final int index) {
        return register[index];
    }

    public void setRegister(final int index, final int value) {
        register[index] = value;
    }

    public int getCurrentCycleCost() {
        return currentCycleCost;
    }

    public String step() {
        final int currentProgramCounter = programCounter;
        currentWord = new Word(memory.readFrom(programCounter));
        currentInstruction = instructions[currentWord.code()];

        decodeParameters();

        currentInstruction.execute();
        programCounter += sumToPC(currentInstruction);

        return assemblerFor(currentProgramCounter);
    }

    private void decodeParameters() {
        a = decoderFor(currentWord.a());
        b = decoderFor(currentWord.b());
        a.setMyProgramCounter(programCounter);
        b.setMyProgramCounter(programCounter + a.size());
    }

    private String assemblerFor(final int currentProgramCounter) {
        currentCycleCost = currentInstruction.cycles() + a.extraCycles() + b.extraCycles();
        if (currentWord.code() != OpCodes.NOT_BASIC) {
            return String.format("%s: %s %s, %s", formatter.toHexa4Spaces(currentProgramCounter), currentWord, a, b);
        } else {
            return String.format("%s: %s", formatter.toHexa4Spaces(currentProgramCounter), currentInstruction);
        }
    }

    private int sumToPC(final Instruction instruction) {
        return (instruction.sumToPC() != 0) ? instruction.sumToPC() + a.size() + b.size() : 0;
    }

    public ParameterDecoder decoderFor(final int value) {
        return decoders[value];
    }
}