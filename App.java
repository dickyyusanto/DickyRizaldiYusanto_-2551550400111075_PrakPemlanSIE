
import java.util.Scanner;

public class App {
public static void main(String[] args) {
//instansiasi objek bernama m1
    Mobil m1 = new Mobil();
    Scanner input = new Scanner (System.in);
    
    System.out.print("Masukkan Merk: ");
    String merkInput = input.nextLine();
    m1.setMerk(merkInput);
    
    System.out.print("Masukkan Nomor Polisi: ");
    String nopolInput = input.nextLine();
    m1.setNopol(nopolInput);
    
    System.out.print("Masukkan Warna: ");
    String warnaInput = input.nextLine();
    m1.setWarna(warnaInput);

    System.out.print("Masukkan Kecepatan (kpj): ");
    int kecepatanInput = input.nextInt();
    m1.setKecepatan(kecepatanInput);
    
    m1.display();
    m1.hitungJarak(2);
    m1.displayKecepatanMS();

    System.out.println("---------------");

    //instansiasi objek bernama m2
    Mobil m2 = new Mobil();

    m2.setKecepatan(100);
    m2.setMerk("Mitsubishi");
    m2.setNopol("N 1134 AG");
    m2.setWarna("Biru");
    m2.display();
    m2.hitungJarak(3);
    m2.displayKecepatanMS();

    System.out.println("---------------");
    System.out.println("Atribut pada objek m1 diubah.");
    
    //mengubah warna dari objek m1
    m1.setWarna("Hijau");

    //menampilkan hasil perubahan
    m1.display();
    input.close();
}
}
