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
public class Manager {
    private String namamgr;
    private String departement;
    private Karyawan krw;

    public Manager(String namamgr, String departement, Karyawan krw) {
        this.namamgr = namamgr;
        this.departement = departement;
        this.krw = krw;
    }

    public String getNamamgr() {
        return namamgr;
    }

    public void setNamamgr(String namamgr) {
        this.namamgr = namamgr;
    }
    
    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Karyawan getKrw() {
        return krw;
    }

    public void setKrw(Karyawan krw) {
        this.krw = krw;
    }
    
    public void info(){
        System.err.println("Nama Manager \t: "+namamgr);
        System.err.println("Departement \t: "+departement);
        System.err.println(" ");
        krw.info();
        System.err.println(" ");
    }
}