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
public class NewAngkot3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<11; i++){
            if(i <= 6 && i != 5){
                System.out.print("Angkot " + i + " beroperaso dengan baik \n");
            }
            else if(i == 8 || i == 10 || i == 5){
                System.out.print("Angkot " + i + " sedang lembur \n");
            }
            else{
                System.out.print("Angkot " + i + " sedang tidak beroperasi \n");
            }
        }
    }
    
}
