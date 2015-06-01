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
public class KebersihanRuangKelas extends SetGetMain{
    Scanner fikri = new Scanner(System.in);

    public KebersihanRuangKelas(String SirUdara, int NilaiPencahayaan, int Kelembapan, int Suhu) {
        super(SirUdara, NilaiPencahayaan, Kelembapan, Suhu);
    }

    @Override
    public void Input() {
        System.out.print("bagaimana keadaan sirkulasi udara : ");
        setSirUdara(fikri.nextLine()) ;
        System.out.print("masukkan kecahayaan : ");
        setNilaiPencahayaan(fikri.nextInt()) ;               
        System.out.print("masukkan kelembapan : ");
        setKelembapan(fikri.nextInt()) ;
        System.out.print("Masukkan suhu : ");
        setSuhu(fikri.nextInt());
        System.out.println("\n\n");
        
    }

    @Override
    public void Analisis() {
       
            //sirkulasi udara
        
            System.out.print("keadaan sirkulasi udara "+getSirUdara());
            if ("Lancar".equals(getSirUdara()) || "lancar".equals(getSirUdara())){
                    System.out.println(" (Sirkulasi Udara sesuai)");
                        }
            else if("Tidak Lancar".equals(getSirUdara()) || "tidak lancar".equals(getSirUdara())){
                    System.out.println(" (Sirkulasi Udara Tidak sesuai)");
            }
            else{
                System.out.println(" (Inputan salah )");
                    }
           
            //pencahayaan
            
            System.out.print("kecahayaannya "+getNilaiPencahayaan());
            if(getNilaiPencahayaan()>=250 && getNilaiPencahayaan()<=350){
                System.out.println(" (Pencahayaan sesuai)");
                    }
            else{
                System.out.println(" (Pencahayaan tidak sesuai)");
                    }
            
            //kelembapan
            
            System.out.print("kelembapannya "+getKelembapan());
            if(getKelembapan()>=70 && getKelembapan()<=80){
                System.out.println(" (Kelembapan sesuai)");
                    }
            else{
                System.out.println(" (Kelembapan tidak sesuai)");
                    }
            
            //suhu
            
            System.out.print("suhunya adalah "+getSuhu());
            if (getSuhu()>=25 && getSuhu()<=35){
                System.out.println(" (Suhu sesuai)");
                    }
            else{
                System.out.println(" (Suhu tidak sesuai)");
                    }
  }

    @Override
    public void Output() {
        System.out.println("keadaan sirkulasi udara "+getSirUdara());
        getSirUdara();
        System.out.println("kecahayaannya "+getNilaiPencahayaan());
        getNilaiPencahayaan();
        System.out.println("kelembapannya "+getKelembapan());
        getKelembapan();
        System.out.println("suhunya adalah "+getSuhu());
        getSuhu();
    }
    
}
