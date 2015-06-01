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
public class KondisiRuangKelas extends SetGetMain{
    Scanner fikri = new Scanner(System.in);
    public KondisiRuangKelas(int PanjangRuang, int LebarRuang, int JumKursi, int JumPintu, int JumJendela) {
        super(PanjangRuang, LebarRuang, JumKursi, JumPintu, JumJendela);
    }

    @Override
    public void Input() {
            System.out.print("Masukkan Panjang Ruangan : ");
            setPanjangRuang(fikri.nextInt());
            System.out.print("Masukkan Lebar Ruangan :  ");
            setLebarRuang(fikri.nextInt());
            System.out.print("Masukkan Jumlah Kursi :  ");
            setJumKursi(fikri.nextInt());
            System.out.print("Masukkan Jumlah Pintu : ");
            setJumPintu(fikri.nextInt());
            System.out.print("Masukkan Jumlah Jendela : ");
            setJumJendela(fikri.nextInt());
            System.out.println("\n\n");
    }

    @Override
    public void Analisis() {
        //Menghitung Luas ruangan
                setLuasRuang(getPanjangRuang()*getLebarRuang());
                System.out.println("Luas Ruangan adalah "+getLuasRuang());
                if(getPanjangRuang()!=getLuasRuang()){ 
                    System.out.println("Persegi Panjang (sesuai)");
                }
                    else{
                        System.out.println("tapi bukan Persegi Panjang (tidak sesuai)");
                }
            //menghitung luas rasio
                setRasio(getLuasRuang()*getJumKursi());
                System.out.println("Rasio Luas adalah "+getRasio());
                if(getRasio()>=0.5){
                    System.out.println("Luas Rasio (Sesuai)");
                }
                    else{
                        System.out.println("Luas Rasio (Tidak Luas)");
                }
          
            //menghitung jumlah pintu dan jendela
                System.out.println("Jumlah Pintu ada "+getJumPintu());
                System.out.println("Jumlah jendela ada "+getJumJendela());
                if (getJumPintu()>=2){
                    System.out.println("Pintu (Sesuai)");
                }
                    else{
                        System.out.println("Pintu (Tidak Sesuai)");
                }
                if (getJumJendela()>=1){
                    System.out.println("Jendela (Sesuai)");
                }
                    else{
                        System.out.println("Jendela (Tidak Sesuai)");
                }
    }

    @Override
    public void Output() {
        //System.out.println("panjang Ruangan "+getPanjangRuang());
        getPanjangRuang();
        System.out.println("Panjang Ruangan "+getPanjangRuang());
        getLebarRuang();
        System.out.println("Lebar Ruangan "+getLebarRuang());
        getJumKursi();
        System.out.println("Kursi ada ");
        getJumPintu();
        System.out.println("Pintu ada "+getJumPintu());
        getJumJendela();
        System.out.println("Jendela ada "+getJumJendela());
    }
    
}
