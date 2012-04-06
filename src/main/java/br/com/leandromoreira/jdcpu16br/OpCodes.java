package br.com.leandromoreira.jdcpu16br;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OpCodes {

    public static final int NOT_BASIC = 0x00;
    public static final int SYSCALL_JSR = 0x01;
    public static final int SET = 0x01;
    public static final int ADD = 0x02;
    public static final int SUB = 0x03;
    public static final int MUL = 0x04;
    public static final int DIV = 0x05;
    public static final int MOD = 0x06;
    public static final int SHL = 0x07;
    public static final int SHR = 0x08;
    public static final int AND = 0x09;
    public static final int BOR = 0x0A;
    public static final int XOR = 0x0B;
    public static final int IFE = 0x0C;
    public static final int IFN = 0x0D;
    public static final int IFG = 0x0E;
    public static final int IFB = 0x0F;

    public final static String toString(final int opcode) {
        if (opcode < 0 | opcode > IFB) {
            throw new IllegalArgumentException("Invalid opcode! [" + opcode + "]");
        }
        final Field[] declaredFields = OpCodes.class.getDeclaredFields();
        final String[] assembler = new String[declaredFields.length];
        final OpCodes instance = new OpCodes();
        for (final Field field : declaredFields) {
            try {
                assembler[field.getInt(instance)] = field.getName();
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(OpCodes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(OpCodes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return assembler[opcode];
    }
}