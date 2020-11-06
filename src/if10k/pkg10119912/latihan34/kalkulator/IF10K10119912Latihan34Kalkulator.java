/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan34.kalkulator;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */

class Kalkulator {
    
    public double jumlah, value1, value2;
    
    public void tambahBilangan() {
        jumlah = value1 + value2;
        System.out.print(jumlah);
    }
    
    public void kurangBilangan() {
        jumlah = value1 - value2;
        System.out.print(jumlah);
    }
    
    public void kaliBilangan() {
        jumlah = value1 * value2;
        System.out.print(jumlah);
    }
    
    public void bagiBilangan() {
        jumlah = value1 / value2;
        System.out.print(String.format("%.2f" , jumlah));
    }
    
    public void sisaBilangan() {
        jumlah = value1 % value2;
        System.out.print(jumlah);
    }
}

public class IF10K10119912Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Kalkulator k = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        k.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        k.value2 = input.nextDouble();
        System.out.println();
        
        System.out.print("Hasil Pertambahan : ");
        k.tambahBilangan();
        System.out.println();
        
        System.out.print("Hasil Pengurangan : ");
        k.kurangBilangan();
        System.out.println();
        
        System.out.print("Hasil Perkalian : ");
        k.kaliBilangan();
        System.out.println();
        
        System.out.print("Hasil Pembagian : ");
        k.bagiBilangan();
        System.out.println();
      
        System.out.print("Hasil Sisa : ");
        k.sisaBilangan();
        System.out.println();
     
    }
    
}
