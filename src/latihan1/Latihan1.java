/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.Scanner;
/**
 *
 * @author M RIZKI AL
 */

public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        double a = 5, b = 3, c = 3,
//                r = 20, t = 40, pi = 3.14;
//        double nilai;
//        nilai = a + b + c;
//        
//        System.out.println(nilai);
//        
////      MENGHITUNG VOLUME TABUNG
//        double v = pi * r * r * t;
//        System.out.println(v);
//        
//        System.out.println("Hallo, ini latihan pertama Java");
//===================================================================
//        INPUT SCANNER
        
        //deklarasi variable
        String nama, alamat;
        int umur;
        
        //membuat object dari class scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan nama anda ");
        nama = input.nextLine();
        System.out.print("masukan alamat anda ");
        alamat = input.nextLine();
        System.out.print("masukan umur anda ");
        umur = input.nextInt();
        
        
        
        System.out.print("nama anda = " + nama +"\n");
        System.out.print("alamat anda = " + alamat +"\n");
        System.out.print("Umur anda = " + umur +"\n");
    
    }
    
    
}
