/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SiamMahasiswaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=================WELCOME TO SIAM=================");
        System.out.println(">>>>>>>>>>>Silahkan Isi Data Diri Anda<<<<<<<<<<<");
        System.out.println("");
        SiamMahasiswa mahasiswa = new SiamMahasiswa();
        System.out.print("NAMA MAHASISWA\t\t\t: ");
        String name = scan.nextLine();
        System.out.print("NIM \t\t\t\t: ");
        String nim = scan.next();
        System.out.print("Jurusan \t\t\t: ");
        String jurus = scan.next();
        System.out.print("Masukkan IP Semester \t\t: ");
        double value = scan.nextDouble();
        System.out.print("Masukkan Kode Mata Kuliah \t: ");
        String code = scan.next();
        System.out.print("Masukkan Mata Kuliah \t\t: ");
        String namecode = scan.next();
        System.out.print("Masukkan Jumlah SKS \t\t: ");
        int skss = scan.nextInt();
        System.out.println("-------------------------------------------------");
        
        System.out.println("********************YOUR DATA********************");
        mahasiswa.setnama(name);
        mahasiswa.setnim(nim);
        mahasiswa.setjurusan(jurus);
        mahasiswa.setip(value);
        mahasiswa.setkodeMatkul(code);
        mahasiswa.setmatkul(namecode);
        mahasiswa.setsks(skss);       
        mahasiswa.displaymessage();
        mahasiswa.jumlahSks(value, skss);        
        System.out.println("=================================================");
        
        SiamMahasiswa mahasiswa2 = new SiamMahasiswa();
        System.out.print("NAMA MAHASISWA\t\t\t: ");
        String name2 = scan.next();
        System.out.print("NIM \t\t\t\t: ");
        String nim2 = scan.next();
        System.out.print("Jurusan \t\t\t: ");
        String jurus2 = scan.next();
        System.out.print("Masukkan IP Semester \t\t: ");
        double value2 = scan.nextDouble();
        System.out.print("Masukkan Kode Mata Kuliah \t: ");
        String code2 = scan.next();
        System.out.print("Masukkan Mata Kuliah \t\t: ");
        String namecode2 = scan.next();
        System.out.print("Masukkan Jumlah SKS \t\t: ");
        int skss2 = scan.nextInt();
        System.out.println("-------------------------------------------------");
        
        System.out.println("********************YOUR DATA********************");
        mahasiswa2.setnama(name2);
        mahasiswa2.setnim(nim2);
        mahasiswa2.setjurusan(jurus2);
        mahasiswa2.setip(value2);
        mahasiswa2.setkodeMatkul(code2);
        mahasiswa2.setmatkul(namecode2);
        mahasiswa2.setsks(skss2);       
        mahasiswa2.displaymessage();
        mahasiswa2.jumlahSks(value2, skss2);
        System.out.println("=================================================");
        
        SiamMahasiswa mahasiswa3 = new SiamMahasiswa();
        System.out.print("NAMA MAHASISWA\t\t\t: ");
        String name3 = scan.next();
        System.out.print("NIM \t\t\t\t: ");
        String nim3 = scan.next();
        System.out.print("Jurusan \t\t\t: ");
        String jurus3 = scan.next();
        System.out.print("Masukkan IP Semester \t\t: ");
        double value3 = scan.nextDouble();
        System.out.print("Masukkan Kode Mata Kuliah \t: ");
        String code3 = scan.next();
        System.out.print("Masukkan Mata Kuliah \t\t: ");
        String namecode3 = scan.next();
        System.out.print("Masukkan Jumlah SKS \t\t: ");
        int skss3 = scan.nextInt();
        System.out.println("-------------------------------------------------");
        
        System.out.println("********************YOUR DATA********************");
        mahasiswa3.setnama(name3);
        mahasiswa3.setnim(nim3);
        mahasiswa3.setjurusan(jurus3);
        mahasiswa3.setip(value3);
        mahasiswa3.setkodeMatkul(code3);
        mahasiswa3.setmatkul(namecode3);
        mahasiswa3.setsks(skss3);          
        mahasiswa3.displaymessage();
        mahasiswa.jumlahSks(value3, skss3);
        System.out.println("=================================================");
    }  
}
