package pert6;
 import java.util.Scanner;
public class PerhLing {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        double diameter = 0;

        System.out.println("==== Perhitungan Lingkaran ====");

        while (true) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            if (input.hasNextDouble()) {
                diameter = input.nextDouble();
                if (diameter > 0) {
                    break; 
                } else {
                    System.out.println("Nilai diameter tidak sesuai (harus lebih besar dari 0)");
                }
            } else {
                System.out.println("Nilai diameter tidak sesuai (masukkan angka saja)");
                input.next(); 
            }
        }

        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = Math.PI * diameter;

        System.out.println("\n==== Hasil Perhitungan Lingkaran ====");
        System.out.printf("Jari-jari lingkaran   = %.2f%n", jariJari);
        System.out.printf("Luas lingkaran        = %.2f%n", luas);
        System.out.printf("Keliling lingkaran    = %.2f%n", keliling);
    }
}

     


