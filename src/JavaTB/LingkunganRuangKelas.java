
package JavaTB;

import java.util.Scanner;


public class LingkunganRuangKelas extends SGKRKdanLRK{
    
    Scanner tama = new Scanner (System.in);
    @Override
    public void Input(){
           
        System.out.println("KONDISI LINGKUNGAN RUANG KELAS:\t ");
        
        System.out.println("Kondisi Lantai (Bersih/Tidak Bersih): ");
        setKonLa(tama.nextLine());
        System.out.println("Kondisi Dinding (Bersih/Tidak Bersih): ");
        setKonDin(tama.nextLine());
        System.out.println("Kondisi Atap (Bersih/Tidak Bersih): ");
        setKonAt(tama.nextLine());
        System.out.println("Kondisi Pintu (Bersih/Tidak Bersih): ");
        setKonPin(tama.nextLine());
        System.out.println("Kondisi Jendela (Bersih/Tidak Bersih): ");
        setKonJen(tama.nextLine());
        
    }
    @Override
    public void Analyze(){
        
    System.out.println("KONDISI HASIL PENELITIAN LINGKUNGAN RUANG KELAS: ");
        
    if("Bersih".equals(getKonLa())   || "bersih".equals(getKonLa())
    &&"Bersih".equals(getKonDin())   || "bersih".equals(getKonDin())
    &&"Bersih".equals(getKonAt())    || "bersih".equals(getKonAt())
    &&"Bersih".equals(getKonPin())   || "bersih".equals(getKonPin())
    &&"Bersih".equals(getKonJen())   || "bersih".equals(getKonJen()))
    
    {
    System.out.println("Sesuai, karena kelas sangat bersih!");
 
    if("Tidak Bersih".equals(getKonLa())     || "tidak bersih".equals(getKonLa())
    ||"Tidak Bersih".equals(getKonDin())     || "tidak bersih".equals(getKonDin())
    ||"Tidak Bersih".equals(getKonAt())      || "tidak bersih".equals(getKonAt())
    ||"Tidak Bersih".equals(getKonPin())     || "tidak bersih".equals(getKonPin())
    ||"Tidak Bersih".equals(getKonJen())     || "tidak bersih".equals(getKonJen())){
    System.out.println("Tidak Sesuai, karena kelas terlihat kotor!");
    }
}
    else{
    System.out.println("Tidak Sesuai, karena kelas terlihat kotor");
    }
    }
}

