/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum1;

/**
 *
 * @author user
 */
public class SiamMahasiswa {
    public String nama;
    public String nim;
    public double ip;
    public String jurusan;
    public String kodeMatkul;
    public String matkul;
    public int sks;

    public void setnama(String b) {
        nama = b;
    }
    public void setnim(String b) {
        nim = b;
    }
    public void setjurusan(String b) {
        jurusan = b;
    }
    public void setip(double b) {
        ip = b;
    }
    public void setkodeMatkul(String b) {
        kodeMatkul = b;
    }
    public void setmatkul(String b) {
        matkul = b;
    }
    public void setsks(int b) {
        sks = b;
    }
    public void jumlahSks(double ip, int sks) {
        if (ip >= 3.5 && ip <= 4) {
            if (sks >= 21 && sks <= 24) {
                System.out.println("Total SKS Maks : " + sks);
            } else {
                System.out.println("Terjadi Kesalahan Pada SKS");
            }
        } else if (ip >= 3 && ip <= 3.4) {
            if (sks >= 16 && sks <= 20) {
                System.out.println("Total SKS Maks : " + sks);
            } else {
                System.out.println("Terjadi Kesalahan Pada SKS");
            }
        } else if (ip >= 2.5 && ip <= 2.9) {
            if (sks >= 11 && sks <= 15) {
                System.out.println("Total SKS Maks : " + sks);
            } else {
                System.out.println("Terjadi Kesalahan Pada SKS");
            }
        } else {
            if (sks >= 1 && sks <= 10) {
                System.out.println("Total SKS Maks : " + sks);
            } else {
                System.out.println("Terjadi Kesalahan Pada SKS");
            }
        }
    }
    public void displaymessage() {
        System.out.println("Nama \t\t\t: " + nama);
        System.out.println("NIM \t\t\t: " + nim);
        System.out.println("Jurusan \t\t: "+jurusan);
        System.out.println("IP \t\t\t: " + ip);
        System.out.println("Kode Mata Kuliah \t: " + kodeMatkul);
        System.out.println("Mata Kuliah \t\t: " + matkul);
        System.out.println("Jumlah SKS \t\t: " + sks);
    }
}
