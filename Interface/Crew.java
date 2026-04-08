package SMT2.Laprak5.Interface;

public class Crew implements ICrew {
    
    private String name;
    private boolean isAlive;

    public Crew(String name) {
        this.name = name;
        this.isAlive = true;
    }

    public void die() {
        this.isAlive = false;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void doWork() {
       if(isAlive) {
        System.out.println("Crew " + this.name + " is doing work.");
       } else {
           System.out.println("Ghost " + this.name + " cannot do work.");
       }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void callMeeting() {
       if(this.isAlive) { 
        System.out.print(this.name + " found a corpse ");
        System.out.print("and calls a meeting. ");
        System.out.println("Let's find the impostor!");
    } else {
        System.out.println("Ghost " + this.name + " cannot call a meeting.");
    }
    }
}