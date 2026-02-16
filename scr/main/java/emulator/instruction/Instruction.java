package emulator.instruction;

import emulator.cpu.CPU;

public interface Instruction {
    void execute(CPU cpu);
}
