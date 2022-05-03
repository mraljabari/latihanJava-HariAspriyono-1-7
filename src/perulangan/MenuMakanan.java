/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author M RIZKI AL
 */
public class MenuMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int x = 0;
        
        while(x != 4){
            System.out.println("---------------");
            System.out.println("   Menu Ayam   ");
            System.out.println("---------------");
            System.out.println("1. Ayam Goreng");
            System.out.println("2. Ayam Bakar");
            System.out.println("3. Ayam Balado");
            System.out.println("4. Keluar");
            System.out.println("---------------");
            System.out.print("masukan angka menu : "); x = input.nextInt();
            
            if(x == 1){
                System.out.println("Anda Memilih Ayam Goreng");
            }else if (x == 2) {
                System.out.println("Anda Memilih Ayam Bakar");                
            }else if (x == 3){
                System.out.println("Anda Memilih Ayam Balado");                
            }else if(x == 4){
                System.out.println("Terima Kasih");                
            }else{
                System.out.println("salah memilih menu");                
            }
            
        }
        
    }
    
}
