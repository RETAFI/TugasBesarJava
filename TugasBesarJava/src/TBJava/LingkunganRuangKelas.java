/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TBJava;



/**
 *
 * @author Fikri
 */
import java.util.Scanner;
public class LingkunganRuangKelas extends SetGetMain{
    Scanner fikri = new Scanner(System.in);

    public LingkunganRuangKelas(String KoLantai, String KoDinding, 
            String KoAtap, String KoPintu, String KoJendela) {
    super(KoLantai, KoDinding, KoAtap, KoPintu, KoJendela);
    }

    @Override
    public void Input() {
        System.out.print("bagaimana kondisi lantai : ");
        setKoLantai(fikri.nextLine());
        System.out.print("bagaimana kondisi dinding : ");
        setKoLantai(fikri.nextLine());
        System.out.print("bagaimana kondisi atap : ");
        setKoLantai(fikri.nextLine());
        System.out.print("bagaimana kondisi pintu : ");
        setKoLantai(fikri.nextLine());
        System.out.print("bagaimana kondisi jendela : ");
        setKoLantai(fikri.nextLine());
    }

    @Override
    public void Analisis() {
        if("bersih".equals(getKoLantai())    || "Bersih".equals(getKoLantai()) 
        &&"bersih".equals(getKoDinding())    || "Bersih".equals(getKoDinding())
        &&"bersih".equals(getKoAtap())       || "Bersih".equals(getKoAtap())
        &&"bersih".equals(getKoPintu())      || "Bersih".equals(getKoPintu())
        &&"bersih".equals(getKoJendela())    || "Bersih".equals(getKoJendela())){
            System.out.println("sesuai, ruang kelas sangat kinclong");   

        if ("tidak bersih".equals(getKoLantai())   || "Tidak Bersih".equals(getKoLantai()) 
        &&"tidak bersih".equals(getKoDinding())    || "Tidak Bersih".equals(getKoDinding())
        &&"tidak bersih".equals(getKoAtap())       || "Tidak Bersih".equals(getKoAtap())
        &&"tidak bersih".equals(getKoPintu())      || "Tidak Bersih".equals(getKoPintu())
        &&"tidak bersih".equals(getKoJendela())    || "TIdak Bersih".equals(getKoJendela())){
            System.out.println("tidak sesuai, ruang kelas kotor semua");
    
            }
        }
        else{
            System.out.println("tidak sesuai, karena ada yang tidak bersih");
        } 
    }

    @Override
    public void Output() {
        getKoLantai();
        System.out.println("Kondisi Lantai "+getKoLantai());
        getKoDinding();
        System.out.println("Kondisi Dinding "+getKoDinding());
        getKoAtap();
        System.out.println("Kondisi Atap "+getKoAtap());
        getKoPintu();
        System.out.println("Kondisi Pintu "+getKoPintu());
        getKoJendela();
        System.out.println("Kondisi Jendela "+getKoJendela());
    
        
    }
    
}
