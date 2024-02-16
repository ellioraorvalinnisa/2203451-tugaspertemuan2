/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_3;

/**
 *
 * @author Elliora Orva Linnisa
 */

/*
1. User memasukkan kedua karakter, kedua karakter tersebut dikonversi menjadi 
kode ASCII dengan menggunakan operasi penugasan yang memasukkan nilai ASCII dari masing-masing 
karakter ke variabel kodeASCII1 dan kodeASCII2.
2. Nilai ASCII tersebut dijumlahkan dan disimpan dalam variabel hasilJumlah.
*/

import java.util.Scanner;

public class Soal_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan karakter ke-1: ");
        char karakter1 = input.next().charAt(0);
        
        System.out.print("Masukkan karakter ke-2: ");
        char karakter2 = input.next().charAt(0);
        
        int kodeASCII1 = (int) karakter1;
        int kodeASCII2 = (int) karakter2;
        
        int hasilJumlah = kodeASCII1 + kodeASCII2;
        
        System.out.println("Jumlah kode ASCII dari " + karakter1 + " dan " + karakter2 + " : " + hasilJumlah);
        
        input.close();
    }
}