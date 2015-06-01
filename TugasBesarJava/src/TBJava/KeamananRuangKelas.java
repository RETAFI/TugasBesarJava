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
public class KeamananRuangKelas extends SetGetMain{
    Scanner fik = new Scanner(System.in);

    public KeamananRuangKelas(String Kekokohan, String KunciPintu, String Jendela, String Bahaya) {
        super(Kekokohan, KunciPintu, Jendela, Bahaya);
    }

    @Override
    public void Input() {
         System.out.print("apakah ruang kelas Kokoh/tidak : ");
        setKekokohan(fik.nextLine());
        System.out.print("apakah kunci ada/tidak : ");
        setKunciPintu(fik.nextLine());
        System.out.print("apakah jendela ada/tidak : ");
        setJendela(fik.nextLine());
        System.out.print("apakah ruang kelas aman/tidak : ");
        setBahaya(fik.nextLine());
        System.out.println("\n\n");
    }

    @Override
    public void Analisis() {
            System.out.print("ruang kelas "+getKekokohan());
        if ("kokoh".equals(getKekokohan()) || "Kokoh".equals(getKekokohan())){
            System.out.println(" (kekokohan sesuai)");
        }
        else if ("tidak kokoh".equals(getKekokohan()) || "Tidak Kokoh".equals(getKekokohan())){
            System.out.println(" (kekokohan tidak sesuai)");
        }
        else{
            System.out.println(" (inputan salah)");
        }
        
        //kunci pintu
        System.out.print("kunci ruang kelas "+getKunciPintu());
        if ("ada".equals(getKunciPintu()) || "Ada".equals(getKunciPintu())){
            System.out.println(" (kunci kelas sesuai)");
        }
        else if ("tidak ada".equals(getKunciPintu()) || "Tidak Ada".equals(getKunciPintu())){
            System.out.println(" (kunci kelas tidak sesuai)");
        }
        
        else{
            System.out.println(" (inputan salah)");
            
        //jendela
        System.out.print("jendela ruang kelas "+getJendela());
        if ("ada".equals(getJendela()) || "Ada".equals(getJendela())){
            System.out.println(" (jendela sesuai)");
        }
        else if ("tidak ada".equals(getJendela()) || "Tidak Ada".equals(getJendela())){
            System.out.println(" (jendela tidak sesuai)");
        }    
        else {
            System.out.println(" (inputan salah)");
        }
        
        //bahaya
        System.out.print("ruang kelas "+getBahaya());
        if ("aman".equals(getBahaya()) ||"Aman".equals(getBahaya())) {
            System.out.println(" (keamanan sesuai)");
        }
        else if ("tidak aman".equals(getBahaya()) ||"Tidak Aman".equals(getBahaya())) {
            System.out.println(" (keamanan tidak sesuai)");
        }
        else {
            System.out.println(" (inputan salah)");
        }
        
        }
    }

    @Override
    public void Output() {
        getKekokohan();
        System.out.println("kekokohan ruang kelas "+getKekokohan());
        getKunciPintu();
        System.out.println("Kunci pintu ruang kelas "+getKunciPintu());
        getJendela();
        System.out.println("Jendela ruang kelas "+getJendela());
        getBahaya();
        System.out.println("Ruang Kelas "+getBahaya());
    }
    
}
