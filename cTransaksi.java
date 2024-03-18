/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bp.ii;
import java.util.Scanner;
/**
 *
 * @author DIMAS FARREL
 */
public class cTransaksi {
    private cPembeli pbl;
    private cProduk prd[];
    private int jumprd[];
    private int totprd[];
    private int idxprd;//indeks array
    private int maksprd;//maksimal kapasitas array
    private String kode;
    private String tgl;
    private int jumlah;
    private int total;        
    cTransaksi(){
        prd=new cProduk[5];
        idxprd=0; maksprd=5;
        System.out.println("Default construktor transaksi..");
    }
    public void setPembeli(String n, String a){
        pbl = new cPembeli(n,a);
    }
    public void setPembeli(cPembeli pb){
        pbl=new cPembeli();
        pbl=pb;
    }
    public void setProduk(cProduk p){
        prd[idxprd]=new cProduk();
        prd[idxprd]=p;
    }
    public void setJumlah(int j){ jumlah=j; }
    public void setTotal(int t){ total=t; }
    public cPembeli getPembeli(){ return pbl; }
    public cProduk[] getProduk(){ return prd; }
    public int getJumlah(){ return jumlah; }
    public int getTotal(){ return total; }
    public int getidxprd(){ return idxprd; }
    /*
    public void tambahProduk(cProduk p, int j){
        prd[idxprd]=p;
        jumprd[idxprd]=j;
        totprd[idxprd]=j*p.getHarga();
    }*/
    public void tambahProduk(cProduk p){
        if(idxprd<maksprd){
            prd[idxprd]=p;
            System.out.println("Tambah Suksss..");
            idxprd++;
        }else{
            System.out.println("Keranjang Penuh!");
        }
    }
    public void lihatTransaksi(){
        System.out.println("Daftar Belanja");
        for (int i = 0; i < idxprd; i++) {
            System.out.println((i+1)+"."+prd[i].getNama());
    }
    System.out.println("");
    }
    public void hapusProduk(String np){
        Scanner sc=new Scanner(System.in);
        boolean ketemu=false;
        for (int i = 0; i < idxprd; i++) {
            if(np.equalsIgnoreCase(prd[i].getNama())){
                ketemu=true;
            }
            System.out.println("Yakin Hapus?");
            System.out.println("1. Ya\n2. Batal");
            System.out.print("Jawab = ");
            int jwb=sc.nextInt();
            if(jwb==1){
                prd[i]=null;
                for (int j = i; j < idxprd; j++) {
                    if(j==idxprd-1){
                        prd[j]=null;
                    }
                    else prd[j]=prd[j+1];
                }
                System.out.println("Hapus Sukses..");
            }else System.out.println("Batal Hapus!");
            break;
        }
    }
}