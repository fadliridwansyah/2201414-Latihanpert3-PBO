/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1percabangan;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

public class Soal1percabangan {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Algoritma untuk menerima masukan dan menentukan hasil
        Scanner input = new Scanner(System.in);

        // Menerima masukan dua bilangan integer
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        // Cek apakah kedua bilangan genap
        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            // Jika genap, tampilkan hasil penjumlahan
            int penjumlahan = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan: " + penjumlahan);
        } else {
            // Jika tidak genap, tampilkan hasil perkalian
            int perkalian = bilangan1 * bilangan2;
            System.out.println("Hasil perkalian: " + perkalian);
        }

        input.close();
    }
}

