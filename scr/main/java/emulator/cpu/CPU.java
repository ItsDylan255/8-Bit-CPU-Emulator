package emulator.cpu;

import emulator.memory.Memory;
import emulator.register.Register;
import emulator.alu.ALU;
import emulator.instruction.Instruction;

import java.util.List;

public class CPU {
    private Memory memory;
    private Register ACC;
    private Register PC;
    private ALU alu;
    private List<Instruction> instructions;

    // TODO: CPU-Zyklus implementieren (fetch-decode-execute)
}
