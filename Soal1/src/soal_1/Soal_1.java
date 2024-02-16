/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_1;

/**
 *
 * @author Elliora Orva Linnisa
 */


/*
1.	Program akan meminta user untuk memasukkan tiga bilangan bulat secara berurutan.
2.	Setelah menerima masukan dari user, program akan melakukan operasi penambahan, 
        pengurangan, perkalian, dan pembagian dari ketiga bilangan yang dimasukkan.
3.	Setiap hasil operasi tersebut kemudian akan dicetak.
*/

import java.util.Scanner;

public class Soal_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan ke-1: ");
        int bilangan1 = input.nextInt();
        
        System.out.print("Masukkan bilangan ke-2: ");
        int bilangan2 = input.nextInt();
        
        System.out.print("Masukkan bilangan ke-3: ");
        int bilangan3 = input.nextInt();
        
        int hasilPenambahan = bilangan1 + bilangan2 + bilangan3;
        System.out.println("Hasil penambahan ketiga bilangan: " + hasilPenambahan);
        
        int hasilPengurangan = bilangan1 - bilangan2 - bilangan3;
        System.out.println("Hasil pengurangan ketiga bilangan: " + hasilPengurangan);
        
        int hasilPerkalian = bilangan1 * bilangan2 * bilangan3;
        System.out.println("Hasil perkalian ketiga bilangan: " + hasilPerkalian);
        
        int hasilPembagian = bilangan1 / bilangan2 / bilangan3;
        System.out.println("Hasil pembagian ketiga bilangan: " + hasilPembagian);
    }
}