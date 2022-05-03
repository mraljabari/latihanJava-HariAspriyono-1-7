/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author M RIZKI AL
 */
public class MenghitungNilai {
    String nama;
    int kehadiran, tugas, uts, uas;
    double hasil;
    public String kelas;
    
    double hitungNilai(){
         hasil = (kehadiran * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);
        //hasil = 10;
        return hasil;
    }
    
    void show(double akhir){
        System.out.println("============================");
        System.out.println("Nama        = " + nama);
        System.out.println("Kehadiran   = " + kehadiran);
        System.out.println("Tugas       = " + tugas);
        System.out.println("UTS         = " + uts);
        System.out.println("UAS         = " + uas);
        System.out.println("============================");
        System.out.println("Nilai Akhir = " + akhir);
    }
}
