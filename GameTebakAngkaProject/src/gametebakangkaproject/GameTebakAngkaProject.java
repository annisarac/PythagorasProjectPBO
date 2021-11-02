/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Scanner;

/**
 *
 * @author AVITA
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //atribut
        
        int angka = 0 + (int)(Math.random() * 100);
        
        System.out.println("Hai.. nama saya Ms. Annisa, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        System.out.print("Masukkan tebakan anda : ");
        int tebakan = input.nextInt();
        
        while(tebakan != angka) {
            if(tebakan > angka) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            }
            
            System.out.print("Masukkan tebakan anda : ");
            tebakan = input.nextInt();
        }
        
        System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
    }
    
}
