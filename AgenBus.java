package SMT2.Laprak4;

public class AgenBus {
    public static void main(String[] args) {
        Tiket t1 = new Tiket();
        t1.pesan();
        t1.tampil();

        TiketBus t2 = new TiketBus();
        t2.pesan();
        t2.tampil();

        TiketBus t3 = new TiketBus();
        t3.pesan("Kasino", "Bandung", 650, 450000);
        t3.tampil();

        t1.pesan("Indro", "Makassar");
        t1.tampil();

        t2.pesan("Dono", "Makassar");
        t2.tampil();

        TiketBus t4 = new TiketBus();
        t4.pesan("Tony");
        t4.tampil();

        TiketBus t5 = new TiketBus() {
            @Override
            public void tampil() {
                System.out.println("===Tiket Bisnis===");
                System.out.println("Nama Penumpang: " + this.namaPenumpang);
                System.out.println("Tujuan: " + this.tujuan);   
                System.out.println("Jarak Tempuh: " + this.jarakTempuh);
                System.out.println("Harga Tiket: " + (this.hargaTiket * 1.5));
                System.out.println("--------------------");
            }
        };
        t5.pesan("Sule", "Bandung", 650, 450000);
        t5.tampil();
    }
}
