/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116520_latihanuts5;

/**
 *
 * @author Flow
 */
public class JajarGenjang implements BangunDatar {
    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCd;
    private final int sisiDa;
    private final int alas;
    private final int tinggi;

    public JajarGenjang(int sisiAb, int sisiBc,int sisiCd, int sisiDa, int alas, int tinggi) {
        this.sisiAb = sisiAb;
        this.sisiBc = sisiBc;
        this.sisiDa = sisiDa;
        this.sisiCd = sisiCd;
        this.alas = alas;
        this.tinggi = tinggi;     
        }
    

    @Override
    public void hitungKeliling() {
       luas = alas* tinggi;
        System.out.println("Luas Jajar Genjang : "+luas);
    }

    @Override
    public void hitungLuas() {
       keliling = 2*(sisiDa + sisiAb);
        System.out.println("Keliling Jajar Genjang : "+keliling);
               }
    
    
    
}
