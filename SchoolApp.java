package SMT2.Laprak2.Enkaspsulasi;

public class SchoolApp{
    public static void main(String[] args){
        Student miki = new Student("Miki");
        Student mini = new Student("Mini");
        
        miki.setSkor(85);
        mini.setSkor(90);

        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor());
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor());
        
        Student.setNama(mini,"Mono");
        
        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor());
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor());
    }
}
