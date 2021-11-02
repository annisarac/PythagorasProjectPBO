/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author AVITA
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilihanMenu;
        double sisiMiring, sisiSiku;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilihan Menu Aplikasi");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku - siku");
        System.out.println("4. Exit");
        
        System.out.print("\nMasukkan nomor menu yang anda pilih : ");
        pilihanMenu = input.nextInt();
        
        switch(pilihanMenu) {
            case (1) :
                System.out.print("Masukkan sisi pertama : ");
                int sisi1 = input.nextInt();
                System.out.print("Masukkan sisi kedua : ");
                int sisi2 = input.nextInt();
                System.out.print("Masukkan sisi miring : ");
                sisiMiring = input.nextInt();
                
                double triplePythagoras = Math.pow(sisi1, 2) + Math.pow(sisi2, 2);
                if( triplePythagoras == Math.pow(sisiMiring, 2)) {
                    System.out.println("\nTriple Pythagoras");
                }
                else {
                    System.out.println("\nBukan Triple Pythagoras");
                }
                break;
            
            case(2) :
                System.out.print("Masukkan sisi pertama : ");
                sisi1 = input.nextInt();
                System.out.print("Masukkan sisi kedua: ");
                sisi2 = input.nextInt();
                
                sisiMiring = Math.sqrt(Math.pow(sisi1, 2)+ Math.pow(sisi2, 2));
                
                System.out.println("\nSisi miringnya yaitu : " + sisiMiring);
                break;
                
            case(3) :
                System.out.print("Masukkan sisi alas / tinggi segitiga : ");
                sisi1 = input.nextInt();
                System.out.print("Masukkan sisi miring : ");
                sisiMiring = input.nextInt();
                
                sisiSiku = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(sisi1, 2));
                
                System.out.println("\nSisi yang lain dari segitiga tersebut adalah : " + sisiSiku);
                break;
            
            case(4) :
                System.exit(0);
            
            default :
                System.out.println("Input Invalid");
        }
    }
    
}
