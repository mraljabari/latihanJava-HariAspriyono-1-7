/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juraganAngkot;

/**
 *
 * @author M RIZKI AL
 */
public class NewAngkot1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<6; i++){
            System.out.print("Angkot " + i + " beroperaso dengan baik \n");
        }

        int n = 6;
        while (n < 11){
            System.out.print("Angkot " + n + " sedang tidak beroperasi \n");
            n++;
        }
             
        
    }
    
}
