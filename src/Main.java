import java.util.Scanner;

class CalculatorClass {
    private double angka1;
    private double angka2;
    private int operator;

    public CalculatorClass(double angka1, double angka2, int operator) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
    }

    public double hitung() {
        double hasil = 0;
        switch (operator) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                return Double.NaN;
        }
        return hasil;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nKALKULATOR");
        System.out.println("=========================");
        System.out.println("1. Pertambahan ( + )");
        System.out.println("2. Pengurangan ( - )");
        System.out.println("3. Perkalian ( * )");
        System.out.println("4. Pembagian ( / )");

        System.out.print("\nPilih operasi (1, 2, 3, 4): ");
        int operator = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        CalculatorClass kalkulator = new CalculatorClass(angka1, angka2, operator);
        double hasil = kalkulator.hitung();

        if (!Double.isNaN(hasil)) {
            System.out.println("Hasil: " + hasil);
        }
    }
}