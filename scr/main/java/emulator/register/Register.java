package emulator.register;

public class Register {
    private int acc; // Accumulator (8-bit)
    private int pc;  // Program Counter (8-bit)

    public Register() {
        this.acc = 0;
        this.pc = 0;
    }

    // ACC methods
    public int getAcc() {
        return acc & 0xFF;  // ensure 8-bit value
    }

    public void setAcc(int value) {
        this.acc = value & 0xFF; // store only 8-bit
    }

    // PC methods
    public int getPc() {
        return pc & 0xFF; // ensure 8-bit value
    }

    public void setPc(int value) {
        this.pc = value & 0xFF; // store only 8-bit
    }

    // increment PC by 1
    public void incrementPc() {
        pc = (pc + 1) & 0xFF; // wrap around 8-bit
    }
}
