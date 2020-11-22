/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan60;

/**
 *
 * @author Muhammd Rifqu Abdillah
 * Kelas    : IF-1
 * NIM      : 10119042
 */
public class PainTendo extends Akatsuki{
    
    private String tujuan;
    private String pengendali;
    
    public PainTendo(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    
    public String getPengendali(){
        return pengendali;
    }
    
    public void setPengendali(String pengendali){
        this.pengendali = pengendali;
    }
    
    @Override
    public void tampilCiriKhas(String ciriKhas){
        System.out.println("Ciri khas\t: " + ciriKhas);
    }
    
    @Override
    public void tampilKekuatan(String kekuatan){
        System.out.println("Kekuatan\t: " + kekuatan);
    }
    
    @Override
    public void tampilDeskripsi(String deskripsi){
        System.out.println("Deskripsi\t: " + deskripsi);
    }
}
