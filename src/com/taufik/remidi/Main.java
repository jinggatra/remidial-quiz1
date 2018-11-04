/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.remidi;

/**
 *
 * @author J I N G G A
 */
public class Main {
    public static void main(String[] args) {
    
        Manager m = new Manager("Bambang", "PT. Cahaya Mentari", new Karyawan("Dwi", "201458", "o"));
        
        
        m.info();
        
        //jawaban no1
        /* Karyawan k1 = new Karyawan();
        k1.setNama("Bella");
        k1.setGoldar("A");
        k1.setNp("2015232");
        k1.info(); */
        
        //jawaban no2
        /* Karyawan k2 = new Karyawan();
        k2.setNama("Budi");
        k2.setNp("201475");
        k2.setGoldar("AB");
        k2.setGaji(2000000);
        k2.info();
        System.err.println("Gaji untuk bulan ini : "+k2.hitungGaji()); */
        
    }
}