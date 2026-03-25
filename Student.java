package SMT2.Laprak2.Enkaspsulasi;

public class Student{
    private String nama;  
    private int skor;
    
    public Student(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getSkor(){
        return this.skor;
    }

    public void setSkor(int skor){
        this.skor = skor;
    }

    public static void setNama(Student std, String nama){
        std.nama = nama;
    }
}
