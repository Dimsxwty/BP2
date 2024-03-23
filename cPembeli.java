/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bp.ii;

/**
 *
 * @author DIMAS FARREL
 */
public class cPembeli {
    private String nama;
    private String alamat;
    cPembeli(){
        System.out.println("Default construktor pembeli...");
    }
    cPembeli(String n, String a){
        nama=n; alamat=a;
        System.out.println("object "+nama+"dibuat...");
    }
    public String getNama(){ return nama; }
    public String getAlamat() { return alamat; }
}