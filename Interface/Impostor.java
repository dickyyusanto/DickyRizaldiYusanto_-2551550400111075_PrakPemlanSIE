package SMT2.Laprak5.Interface;

public class Impostor implements IImpostor, ICrew {
    
    private  final String name;

    public Impostor(String name) {
        this.name = name;
    }
    
    @Override
    public void kill(ICrew crew) {
        System.out.println(crew.getName() + " has been killed!");
        if(crew instanceof Crew) {
            ((Crew) crew).die();
        }
    }
      
    @Override
    public void doWork() {
        System.out.println("Impostor " + this.name + " is doing work.");
    }
     
    @Override
    public String getName() {
        return this.name;
    }
}
