package SMT2.Laprak4;

public class NonPlayableChar extends Character {

    public NonPlayableChar(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Non-playable character " + this.name + " is doing work.");
    }
    
}