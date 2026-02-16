package emulator.memory;

public class Memory {
    private int[] data;

    public Memory() {
        data = new int[256];  // immer 8-Bit RAM
    }

    public int read(int address) {
        if (address < 0 || address >= data.length) throw new IllegalArgumentException("Ungültige Adresse: " + address);
        return data[address];
    }

    public void write(int address, int value) {
        if (address < 0 || address >= data.length) throw new IllegalArgumentException("Ungültige Adresse: " + address);
        data[address] = value & 0xFF;  // 8-Bit Begrenzung
    }
}
