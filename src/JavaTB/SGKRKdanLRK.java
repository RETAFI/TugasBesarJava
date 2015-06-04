
package JavaTB;


public abstract class SGKRKdanLRK {
    public abstract void Input();
    public abstract void Analyze();
    
    private String KonLa;
    private String KonDin;
    private String KonAt;
    private String KonPin;
    private String KonJen;
    private String KonSu;
    private String KonAr;
    private String KonBoc;
    private String KonRus;
    private String KonAu;

    public String getKonLa() {
        return KonLa;
    }

    public void setKonLa(String KonLa) {
        this.KonLa = KonLa;
    }

    public String getKonDin() {
        return KonDin;
    }

    public void setKonDin(String KonDin) {
        this.KonDin = KonDin;
    }

    public String getKonAt() {
        return KonAt;
    }

    public void setKonAt(String KonAt) {
        this.KonAt = KonAt;
    }

    public String getKonPin() {
        return KonPin;
    }

    public void setKonPin(String KonPin) {
        this.KonPin = KonPin;
    }

    public String getKonJen() {
        return KonJen;
    }

    public void setKonJen(String KonJen) {
        this.KonJen = KonJen;
    }

    public String getKonSu() {
        return KonSu;
    }

    public void setKonSu(String KonSu) {
        this.KonSu = KonSu;
    }

    public String getKonAr() {
        return KonAr;
    }

    public void setKonAr(String KonAr) {
        this.KonAr = KonAr;
    }

    public String getKonBoc() {
        return KonBoc;
    }

    public void setKonBoc(String KonBoc) {
        this.KonBoc = KonBoc;
    }

    public String getKonRus() {
        return KonRus;
    }

    public void setKonRus(String KonRus) {
        this.KonRus = KonRus;
    }

    public String getKonAu() {
        return KonAu;
    }

    public void setKonAu(String KonAu) {
        this.KonAu = KonAu;
    }

    public static void main (String [] args){
        LingkunganRuangKelas Ta = new LingkunganRuangKelas();
        KenyamananRuangKelas Ma = new KenyamananRuangKelas();
        
        Ta.Input();
        Ma.Input();
        Ta.Analyze();
        Ma.Analyze();
}
}