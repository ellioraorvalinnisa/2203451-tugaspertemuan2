/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_2;

/**
 *
 * @author Elliora Orva Linnisa
 */

/*
1. Meminta pengguna untuk memasukkan jumlah uang dan apakah hari ini hujan.
2. Mengambil input jumlah uang dan kondisi hujan.
3. Membuat variabel boolean membeliGorengan yang bernilai 
   true jika uang lebih dari 5000 dan tidak hujan.
4. Mengecek apakah membeliGorengan bernilai true.
5. Menampilkan pesan sesuai dengan hasil pengecekan.
*/

import java.util.Scanner;

public class Soal_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input jumlah uang Anda (dalam rupiah): ");
        int uang = input.nextInt();
        
        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = input.nextBoolean();
        
        boolean membeliGorengan = (uang > 5000) && (!hujan);
        
        if (membeliGorengan) {
            System.out.println("Anda akan membeli gorengan!");
        } else {
            System.out.println("Anda tidak akan membeli gorengan");
        }
        
        input.close();
    }
}