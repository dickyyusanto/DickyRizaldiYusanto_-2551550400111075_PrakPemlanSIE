package SMT2.Laprak4;

public class Impostor extends Character {

    public Impostor(Character ch) {
        this.name = ch.name;
    }

    public void kill(Character ch) {
        System.out.println(ch.name + " has been killed!");
    }

}