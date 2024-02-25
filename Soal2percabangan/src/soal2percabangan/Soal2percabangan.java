/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2percabangan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */


public class Soal2percabangan {

    public static void main(String[] args) {
        // Algoritma untuk menentukan nilai indeks akhir mahasiswa

        Scanner input = new Scanner(System.in);

        // Input nilai UTS, UAS, dan Tugas
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        // Hitung nilai akhir (NA) dengan bobot tertentu
        double nilaiAkhir = (0.35 * nilaiUTS) + (0.45 * nilaiUAS) + (0.20 * nilaiTugas);

        // Tentukan nilai indeks akhir berdasarkan nilai akhir (NA)
        char nilaiIndeks;
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiIndeks = 'A';
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            nilaiIndeks = 'B';
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 70) {
            nilaiIndeks = 'C';
        } else {
            nilaiIndeks = 'E';
        }

        // Tampilkan nilai indeks akhir
        System.out.println("Nilai Indeks Akhir: " + nilaiIndeks);

        input.close();
    }
}

