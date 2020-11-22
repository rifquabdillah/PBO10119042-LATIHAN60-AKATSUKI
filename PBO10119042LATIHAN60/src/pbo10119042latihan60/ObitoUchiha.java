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
public class ObitoUchiha extends Akatsuki{
    
    private String elemen;
    private String karakter;
    private String tujuan;
    private String namaPanggilan;
    
    public ObitoUchiha(String nama, String asal, String pangkat, String namaCincin, String posisiCincin){
        super(nama,asal,pangkat,namaCincin,posisiCincin);
    }
    
    public String getNamaPanggilan(){
        return namaPanggilan;
    }
    
    public void setNamaPanggilan(String namaPanggilan){
        this.namaPanggilan = namaPanggilan;
    }
    
    public String getElemen(){
        return elemen;
    }
    
    public void setElemen(String elemen){
        this.elemen = elemen;
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
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
