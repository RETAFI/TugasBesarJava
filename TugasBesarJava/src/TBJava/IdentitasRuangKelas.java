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
public class IdentitasRuangKelas extends SetGetMain{
    Scanner fik = new Scanner(System.in);
    
    public IdentitasRuangKelas(String NamaRuang, String LokasiRuang, String Fakultas) {
        super(NamaRuang, LokasiRuang, Fakultas);
    }

    @Override
    public void Input() {
        System.out.println("=====Identitas Ruangkelas======");
        System.out.print("Nama Ruangan : ");
        setNamaRuang(fik.nextLine());
        System.out.print("Lokasi Ruangan : ");
        setLokasiRuang(fik.nextLine());
        System.out.print("Fakultas : ");
        setFakultas(fik.nextLine());
        System.out.println("\n");
    
    }

    @Override
    public void Analisis() {
        System.out.println("===== Hasil Identitas RuangKelas ===== ");
        getNamaRuang();
        System.out.println("Ruangan Berada di "+getNamaRuang());
        getLokasiRuang();
        System.out.println("Lokasi Ruangan berada di "+getLokasiRuang());
        getFakultas();
        System.out.println("Fakultas "+getFakultas());
    }

    @Override
    public void Output() {
        return;
    }

}
