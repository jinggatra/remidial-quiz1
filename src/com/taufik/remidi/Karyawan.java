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
public class Karyawan{
    private String nama;
    private String np;
    private String goldar;
    private double gaji;
    private float potongan = 0.5f;

    public Karyawan() {
        
    }
    
    
    public Karyawan(String nama, String np, String goldar) {
        this.nama = nama;
        this.np = np;
        this.goldar = goldar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }
    
    //jawaban no 2
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public double hitungGaji(){
        return gaji*potongan;
    }
    //--   
    public void info(){
        System.err.println("Nama \t\t: "+nama);
        System.err.println("ID Karyawan \t: "+np);
        System.err.println("Golongan Darah \t: "+ goldar);

    }
}
