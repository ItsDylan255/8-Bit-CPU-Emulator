package emulator.instruction;

import emulator.cpu.CPU;

public interface Instruction {
    void execute(CPU cpu);
}

// Beispiel für eine konkrete Instruction
package emulator.instruction;

import emulator.cpu.CPU;

public class LoadInstruction implements Instruction {
    private int address;

    public LoadInstruction(int address) {
        this.address = address;
    }

    @Override
    public void execute(CPU cpu) {
        // TODO: Lade Wert aus Memory in ACC
    }
}
