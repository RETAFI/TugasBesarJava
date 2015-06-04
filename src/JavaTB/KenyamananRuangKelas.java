package JavaTB;

import java.util.Scanner;


public class KenyamananRuangKelas extends SGKRKdanLRK{
	
        Scanner tama = new Scanner (System.in);
    @Override    
    public void Input(){
        
        System.out.println("KONDISI KENYAMANAN RUANG KELAS: ");
        
        System.out.println("Kondisi Suara Dalam Kelas (Bising/Tidak): ");
        setKonSu(tama.next());
        System.out.println("Kondisi Aroma Ruang Kelas (Bau/Tidak): ");
        setKonAr(tama.next());
        System.out.println("Kondisi Kebocoran Kelas (Bocor/Tidak): ");
        setKonBoc(tama.next());
        System.out.println("Kondisi Kerusakan Kelas (Rusak/Tidak): ");
	setKonRus(tama.next());
        System.out.println("Kondisi Keausan Kelas (Aus/Tidak): ");
        setKonAu(tama.next());
    }
    @Override
    public void Analyze(){
        
        System.out.println("KONDISI HASIL PENELITIAN KENYAMANAN RUANG KELAS: ");
        
        if ("Tidak".equals(getKonSu()) || "tidak".equals(getKonSu())){
	System.out.println("Sesuai");
        }
        else{
	System.out.println("Tidak Sesuai");
	}
        if ("Tidak".equals(getKonAr()) || "tidak".equals(getKonAr())){
	System.out.println("Sesuai");
        }
        else{
	System.out.println("Tidak Sesuai");
	}
        if ("Tidak".equals(getKonBoc()) || "tidak".equals(getKonBoc())){
        System.out.println("Sesuai");
        }
        else{
	System.out.println("Tidak Sesuai");
	}
        if ("Tidak".equals(getKonRus()) || "tidak".equals(getKonRus())){
	System.out.println("Sesuai");
        }
        else{
	System.out.println("Tidak Sesuai");
	}
        if ("Tidak".equals(getKonAu()) || "tidak".equals(getKonAu())){
	System.out.println("Sesuai");
        }
        else{
	System.out.println("Tidak Sesuai");
	}
    } 

}