/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataMahasiswa;

/**
 *
 * @author M RIZKI AL
 */
public class classMahasiswa {
    String nama, kelas;
    int nik, kehadiran, tugas, uts, uas;
    
    double fungsiHitung(){
        double hitung = ((tugas*0.1) + (kehadiran*0.2) + (uts*0.1) + (uas*0.1)) / 5;
        return hitung;
    }
    
    void show(){
        System.out.print("--------------------\n");
        System.out.print("-------HASIL--------\n");
        System.out.print("--------------------\n");
        System.out.print("Nama Mahasiswa " + nama + "\n");
        System.out.print("Kelas Mahasiswa " + kelas + "\n");
        System.out.print("NIK Mahasiswa " + nik + "\n");
        System.out.print("Nilai Akhir " + fungsiHitung() + "\n");
    }
    
}
