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
public abstract class SetGetMain {

    private String NamaRuang;
    private String LokasiRuang;
    private String Fakultas;
    private int PanjangRuang;
    private int LebarRuang;
    private int LuasRuang ;
    private int JumKursi;
    private double Rasio ;
    private int JumPintu;
    private int JumJendela;
    private int Steker;
    private String Kondisisteker;
    private String Posisisteker;
    private int KabelLcd;
    private String KondisiKabelLcd;
    private String PosisiKabelLcd;
    private int Lampu;
    private String Kondisilampu;
    private String Posisilampu;
    private int Kipas;
    private String Kondisikipas;
    private String Posisikipas;
    private int Ac;
    private String Kondisiac;
    private String Posisiac;
    private String SSID;
    private String internet;
    private int Cctv;
    private String Kondisicctv;
    private String Posisicctv;
    private String SirUdara;
    private String KoLantai;
    private String KoDinding;
    private String KoAtap;
    private String KoPintu;
    private String KoJendela;
    private int NilaiPencahayaan;
    private int Kelembapan;
    private int Suhu;
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;
    private String Kekokohan;
    private String KunciPintu;
    private String Jendela;
    private String Bahaya;

    public SetGetMain(String NamaRuang, String LokasiRuang, String Fakultas) {
        this.NamaRuang = NamaRuang;
        this.LokasiRuang = LokasiRuang;
        this.Fakultas = Fakultas;
    }

    public SetGetMain(int PanjangRuang, int LebarRuang, int JumKursi, int JumPintu, int JumJendela) {
        this.PanjangRuang = PanjangRuang;
        this.LebarRuang = LebarRuang;
        this.JumKursi = JumKursi;
        this.JumPintu = JumPintu;
        this.JumJendela = JumJendela;
    }

    public SetGetMain(int Steker, String Kondisisteker, String Posisisteker, int KabelLcd, String KondisiKabelLcd, String PosisiKabelLcd, int Lampu, String Kondisilampu, String Posisilampu, int Kipas, String Kondisikipas, String Posisikipas, int Ac, String Kondisiac, String Posisiac, String SSID, String internet, int Cctv, String Kondisicctv, String Posisicctv) {
        this.Steker = Steker;
        this.Kondisisteker = Kondisisteker;
        this.Posisisteker = Posisisteker;
        this.KabelLcd = KabelLcd;
        this.KondisiKabelLcd = KondisiKabelLcd;
        this.PosisiKabelLcd = PosisiKabelLcd;
        this.Lampu = Lampu;
        this.Kondisilampu = Kondisilampu;
        this.Posisilampu = Posisilampu;
        this.Kipas = Kipas;
        this.Kondisikipas = Kondisikipas;
        this.Posisikipas = Posisikipas;
        this.Ac = Ac;
        this.Kondisiac = Kondisiac;
        this.Posisiac = Posisiac;
        this.SSID = SSID;
        this.internet = internet;
        this.Cctv = Cctv;
        this.Kondisicctv = Kondisicctv;
        this.Posisicctv = Posisicctv;
    }

    
    public SetGetMain(String KoLantai, String KoDinding, String KoAtap, String KoPintu, String KoJendela) {
        this.KoLantai = KoLantai;
        this.KoDinding = KoDinding;
        this.KoAtap = KoAtap;
        this.KoPintu = KoPintu;
        this.KoJendela = KoJendela;
    }

    public SetGetMain(String SirUdara, int NilaiPencahayaan, int Kelembapan, int Suhu) {
        this.SirUdara = SirUdara;
        this.NilaiPencahayaan = NilaiPencahayaan;
        this.Kelembapan = Kelembapan;
        this.Suhu = Suhu;
    }


    public SetGetMain(String Kekokohan, String KunciPintu, String Jendela, String Bahaya) {
        this.Kekokohan = Kekokohan;
        this.KunciPintu = KunciPintu;
        this.Jendela = Jendela;
        this.Bahaya = Bahaya;
    }

    
    
    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasiRuang(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public int getPanjangRuang() {
        return PanjangRuang;
    }

    public void setPanjangRuang(int PanjangRuang) {
        this.PanjangRuang = PanjangRuang;
    }

    public int getLebarRuang() {
        return LebarRuang;
    }

    public void setLebarRuang(int LebarRuang) {
        this.LebarRuang = LebarRuang;
    }

    public int getLuasRuang() {
        return LuasRuang;
    }

    public void setLuasRuang(int LuasRuang) {
        this.LuasRuang = LuasRuang;
    }

    public int getJumKursi() {
        return JumKursi;
    }

    public void setJumKursi(int JumKursi) {
        this.JumKursi = JumKursi;
    }

    public double getRasio() {
        return Rasio;
    }

    public void setRasio(double Rasio) {
        this.Rasio = Rasio;
    }

    public int getJumPintu() {
        return JumPintu;
    }

    public void setJumPintu(int JumPintu) {
        this.JumPintu = JumPintu;
    }

    public int getJumJendela() {
        return JumJendela;
    }

    public void setJumJendela(int JumJendela) {
        this.JumJendela = JumJendela;
    }

    public int getSteker() {
        return Steker;
    }

    public void setSteker(int Steker) {
        this.Steker = Steker;
    }

    public String getKondisisteker() {
        return Kondisisteker;
    }

    public void setKondisisteker(String Kondisisteker) {
        this.Kondisisteker = Kondisisteker;
    }

    public String getPosisisteker() {
        return Posisisteker;
    }

    public void setPosisisteker(String Posisisteker) {
        this.Posisisteker = Posisisteker;
    }

    public int getKabelLcd() {
        return KabelLcd;
    }

    public void setKabelLcd(int KabelLcd) {
        this.KabelLcd = KabelLcd;
    }

    public String getKondisiKabelLcd() {
        return KondisiKabelLcd;
    }

    public void setKondisiKabelLcd(String KondisiKabelLcd) {
        this.KondisiKabelLcd = KondisiKabelLcd;
    }

    public String getPosisiKabelLcd() {
        return PosisiKabelLcd;
    }

    public void setPosisiKabelLcd(String PosisiKabelLcd) {
        this.PosisiKabelLcd = PosisiKabelLcd;
    }

    public int getLampu() {
        return Lampu;
    }

    public void setLampu(int Lampu) {
        this.Lampu = Lampu;
    }

    public String getKondisilampu() {
        return Kondisilampu;
    }

    public void setKondisilampu(String Kondisilampu) {
        this.Kondisilampu = Kondisilampu;
    }

    public String getPosisilampu() {
        return Posisilampu;
    }

    public void setPosisilampu(String Posisilampu) {
        this.Posisilampu = Posisilampu;
    }

    public int getKipas() {
        return Kipas;
    }

    public void setKipas(int Kipas) {
        this.Kipas = Kipas;
    }

    public String getKondisikipas() {
        return Kondisikipas;
    }

    public void setKondisikipas(String Kondisikipas) {
        this.Kondisikipas = Kondisikipas;
    }

    public String getPosisikipas() {
        return Posisikipas;
    }

    public void setPosisikipas(String Posisikipas) {
        this.Posisikipas = Posisikipas;
    }

    public int getAc() {
        return Ac;
    }

    public void setAc(int Ac) {
        this.Ac = Ac;
    }

    public String getKondisiac() {
        return Kondisiac;
    }

    public void setKondisiac(String Kondisiac) {
        this.Kondisiac = Kondisiac;
    }

    public String getPosisiac() {
        return Posisiac;
    }

    public void setPosisiac(String Posisiac) {
        this.Posisiac = Posisiac;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getCctv() {
        return Cctv;
    }

    public void setCctv(int Cctv) {
        this.Cctv = Cctv;
    }

    public String getKondisicctv() {
        return Kondisicctv;
    }

    public void setKondisicctv(String Kondisicctv) {
        this.Kondisicctv = Kondisicctv;
    }

    public String getPosisicctv() {
        return Posisicctv;
    }

    public void setPosisicctv(String Posisicctv) {
        this.Posisicctv = Posisicctv;
    }

    public String getSirUdara() {
        return SirUdara;
    }

    public void setSirUdara(String SirUdara) {
        this.SirUdara = SirUdara;
    }

    public String getKoLantai() {
        return KoLantai;
    }

    public void setKoLantai(String KoLantai) {
        this.KoLantai = KoLantai;
    }

    public String getKoDinding() {
        return KoDinding;
    }

    public void setKoDinding(String KoDinding) {
        this.KoDinding = KoDinding;
    }

    public String getKoAtap() {
        return KoAtap;
    }

    public void setKoAtap(String KoAtap) {
        this.KoAtap = KoAtap;
    }

    public String getKoPintu() {
        return KoPintu;
    }

    public void setKoPintu(String KoPintu) {
        this.KoPintu = KoPintu;
    }

    public String getKoJendela() {
        return KoJendela;
    }

    public void setKoJendela(String KoJendela) {
        this.KoJendela = KoJendela;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintu() {
        return KunciPintu;
    }

    public void setKunciPintu(String KunciPintu) {
        this.KunciPintu = KunciPintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }
    
    public abstract void Input();
    public abstract void Analisis();
    public abstract void Output();
    
    public static void main(String[] args) {
       IdentitasRuangKelas a = new IdentitasRuangKelas();
       a.Input();
       a.Output();
       KondisiRuangKelas b = new KondisiRuangKelas();
       b.Input();
       b.Analisis();
       b.Output();
       JumlahKondisiPosisiSarana c = new JumlahKondisiPosisiSarana();
       c.Input();
       c.Analisis();
       c.Output();
       LingkunganRuangKelas d = new LingkunganRuangKelas();
       d.Input();
       d.Analisis();
       d.Output();
       KebersihanRuangKelas e = new KebersihanRuangKelas();
       e.Input();
       e.Analisis();
       e.Output();
       KenyamananRuangKelas f = new KenyamananRuangKelas();
       f.Input();
       f.Analisis();
       f.Output();
       
    }
    

    /* 
        public abstract void InputkondisiRuangKelas();
        public abstract void analisisKondisiRuangKelas();
        public abstract void outputKondisiRuangKelas();
        public abstract void inputSaranaKelas();
        public abstract void analisisSaranaKelas();
        public abstract void outputSaranaKelas();
        public abstract void inputKebersihanRuangKelas();
        public abstract void analisisKebersihanRuangKelas();
        public abstract void outputanalisisKebersihanRuangKelas();
        public abstract void inputKenyamananRuangKelas();
        public abstract void analisis
    */
}
