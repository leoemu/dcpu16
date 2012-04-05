package br.com.leandromoreira.jdcpu16br;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static br.com.leandromoreira.jdcpu16br.OpCode.*;
import org.junit.Before;
import org.junit.Test;

public class TestOpCode {

    public static final int WORD = 0x7C01;
    private OpCode opCode;

    @Before
    public void setup() {
        opCode = new OpCode(WORD);
    }

    @Test
    public void returns_instruction() {
        assertThat(opCode.instruction(), is(WORD));
    }

    @Test
    public void returns_opcode() {
        assertThat(opCode.code(), is(SET));
    }

    @Test
    public void returns_a() {
        assertThat(opCode.a(), is(0x00));
    }

    @Test
    public void returns_b() {
        assertThat(opCode.b(), is(0x1F));
    }
}