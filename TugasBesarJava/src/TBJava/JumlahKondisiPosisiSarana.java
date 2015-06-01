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
public class JumlahKondisiPosisiSarana extends SetGetMain{
    Scanner scan = new Scanner(System.in);
    public JumlahKondisiPosisiSarana(int Steker, String Kondisisteker, String Posisisteker, 
            int KabelLcd, String KondisiKabelLcd, String PosisiKabelLcd, int Lampu, 
            String Kondisilampu, String Posisilampu, int Kipas, String Kondisikipas, 
            String Posisikipas, int Ac, String Kondisiac, String Posisiac, String SSID, 
            String internet, int Cctv, String Kondisicctv, String Posisicctv) {
    super(Steker, Kondisisteker, Posisisteker, 
            KabelLcd, KondisiKabelLcd, PosisiKabelLcd, Lampu, 
            Kondisilampu, Posisilampu, Kipas, Kondisikipas, Posisikipas,
            Ac, Kondisiac, Posisiac, SSID, 
            internet, Cctv, Kondisicctv, Posisicctv);
}

    @Override
    public void Input() {
        
    }

    @Override
    public void Analisis() {
    
    }

    @Override
    public void Output() {
    
    }
    
}
