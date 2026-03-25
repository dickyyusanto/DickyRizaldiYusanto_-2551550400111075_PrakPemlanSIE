package SMT2.Laprak2.member;

public class GeometriApp {
    public static void main(String[] args) {
    Lingkaran lingKecil = new Lingkaran(2.0f);
    Lingkaran lingBesar = new Lingkaran(11.0f);

    float lK = lingKecil.luas(lingKecil.r);
    float lB = lingBesar.luas(lingBesar.r);

    float kK = lingKecil.keliling(lingKecil.r);
    float kB = lingBesar.keliling(lingBesar.r);
    
    System.out.println("Luas Lingkaran Kecil: " + lK);
    System.out.println("Luas Lingkaran Besar: " + lB);

    System.out.println("Keliling Lingkaran Kecil: " + kK);
    System.out.println("Keliling Lingkaran Besar: " + kB);
}
}