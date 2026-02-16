package emulator;

import emulator.memory.Memory;

public class Main {
    public static void main(String[] args) {
        System.out.println("8-Bit CPU Simulator startet...");

        // Memory erstellen (paramaterlos, immer 256 Bytes)
        Memory memory = new Memory();

        // Werte schreiben
        memory.write(10, 123);   // normale Zahl
        memory.write(20, 300);   // wird automatisch auf 44 begrenzt (300 & 0xFF)

        // Werte lesen und ausgeben
        System.out.println("Wert bei Adresse 10: " + memory.read(10));  // Ausgabe: 123
        System.out.println("Wert bei Adresse 20: " + memory.read(20));  // Ausgabe: 44

        // Test: ungültige Adresse
        try {
            memory.read(300);  // außerhalb des Speichers
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler korrekt erkannt: " + e.getMessage());
        }

        System.out.println("Memory-Test abgeschlossen!");
    }
}
