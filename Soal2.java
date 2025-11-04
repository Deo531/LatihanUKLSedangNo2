import java.util.Scanner;

public class Soal2 {
    public static double hitungvolume(double jariJari, double tinggi) {
        return Math.PI * Math.pow (jariJari, 2) * tinggi;
    }

    public static void hasilhitung (double jariJari, double tinggi, double volume) {
        System.out.println("===Hasil Hitung===");
        System.out.println("Jari-Jari : " + jariJari);
        System.out.println("Tinggi : " + tinggi);
        System.out.printf("Volume Tabung : %.2f cm^3\n", volume);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Voluume Tabung");
        System.out.println("==================================");

        //Inputan User
        System.out.print("Masukkan Jari-Jari : ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double tinggi = input.nextDouble();

        //Memanggil Function Hitung Volume
        double volume = hitungvolume(jariJari, tinggi);

        //Memanggil Function Hasil Hitung
        hasilhitung (jariJari, tinggi, volume);
    }
}
