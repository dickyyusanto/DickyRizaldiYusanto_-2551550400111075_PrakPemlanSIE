
public class Mobil {
    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private double jarakTempuh;

    public void setNopol(String n) {
        nopol = n;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setMerk(String m) {
        merk = m;
    }

    public void setKecepatan(int k) {
        kecepatan = k;
    }

    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memililki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");  
    } 

    public void hitungJarak(int waktu) {
        this.jarakTempuh = kecepatan * waktu;
        System.out.println("jarak tempuh mobil adalah " + this.jarakTempuh + " km");
}

    public double getJarakTempuh() {
        return this.jarakTempuh;
    }

    public void displayKecepatanMS() {
        double kecepatanMS = this.kecepatan / 3.6;
        System.out.println("Kecepatan mobil dalam m/s: " + kecepatanMS);
    }
}
