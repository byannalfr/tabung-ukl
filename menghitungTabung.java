package byannalfr;

import java.util.Scanner;

public class menghitungTabung {
public static double hitungVolume(double jariJari, double tinggi) {
        // Pi
        final double PI = 3.14;
        return PI * jariJari * jariJari * tinggi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Input jari jari dan tinggi
        System.out.print("Masukkan jari-jari alas tabung (cm): ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = scanner.nextDouble();
        double volume = hitungVolume(jariJari, tinggi);
        System.out.println("Volume tabung adalah: " + volume + " cm3");
        scanner.close();
    }
}
