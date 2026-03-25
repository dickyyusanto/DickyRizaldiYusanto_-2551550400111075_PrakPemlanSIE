package SMT2.Laprak3;

public class Car extends Vehicle {
    protected int numWheel = 4;
    Car() {
        System.out.println("Car is created");
    }

    public void drift() {
        System.out.println("Car is drifting");
    }

    public void honk() {
        System.out.println("Car is honking");
    }
}
