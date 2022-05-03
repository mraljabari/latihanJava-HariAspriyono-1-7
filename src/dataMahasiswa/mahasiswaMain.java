/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataMahasiswa;

import java.util.Scanner;
import javafx.application.ConditionalFeature;
import latihan1.MenghitungNilai;

/**
 *
 * @author M RIZKI AL
 */
public class mahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        classMahasiswa n = new classMahasiswa();
        
        
        System.out.print("--------------------\n");
        System.out.print("INPUT DATA MAHASISWA\n");
        System.out.print("--------------------\n");
        System.out.print("Nama Mahasiswa : "); n.nama = input.nextLine();
        System.out.print("Kelas Mahasiswa : "); n.kelas = input.nextLine();
        System.out.print("NIK Mahasiswa : "); n.nik = input.nextInt();
        System.out.print("Nilai Kehadiran : "); n.kehadiran = input.nextInt();
        System.out.print("Nilai Tugas-tugas : "); n.tugas = input.nextInt();
        System.out.print("Nilai UTS : "); n.uts = input.nextInt();
        System.out.print("Nilai UAS : "); n.uas = input.nextInt();
        
        n.show();
        }
    
}
