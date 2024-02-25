/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3percabangan;

/**
 *
 * @author Lenovo
 */
public class Soal3percabangan {

    public static void main(String[] args) {
        // Algoritma untuk menghitung jumlah mobil yang diperlukan

        java.util.Scanner input = new java.util.Scanner(System.in);

        // Input jumlah penumpang
        System.out.print("Masukkan jumlah penumpang: ");
        int jumlahPenumpang = input.nextInt();

        // Hitung jumlah mobil yang diperlukan
        int jumlahMobil = jumlahPenumpang / 7; // Hitung jumlah mobil tanpa sisa
        if (jumlahPenumpang % 7 != 0) { // Jika ada sisa, tambahkan 1 mobil
            jumlahMobil++;
        }

        // Tampilkan jumlah mobil yang diperlukan
        System.out.println("Jumlah mobil yang diperlukan: " + jumlahMobil);

        input.close();
    }
}

