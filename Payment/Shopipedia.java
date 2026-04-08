package SMT2.Laprak5.Payment;

public class Shopipedia {
    public static void main(String[] args) {
        
        ShopiPay shopiCard = new ShopiPay();
        
        Customer miki = new Customer(shopiCard);
        miki.deposit(10000);
        miki.pay(2000);
        miki.pay(3000);
        miki.deposit(1000);
        miki.pay(7000);

        System.out.println("------------------");

        Opo card = new Opo();

        Customer dono = new Customer(card);
        dono.deposit(10000);
        dono.pay(2000);
        dono.pay(3000);
        dono.deposit(1000);
        dono.pay(7000);

        System.out.println("------------------");

        Emoney QR = new Emoney() {
            
            {
                this.name = "QR";
            }

            @Override
            public void topUp(double amount) {
                System.out.println("Top up: " + amount);
                this.balance += (amount + (0.1 * amount));
                this.balance();
            }

            @Override
            public void pay(double amount) {
                if (this.balance > amount) {
                    this.balance -= amount;
                    System.out.printf("Pay " + amount);
                    System.out.println(" using " + this.name);
                } else System.out.println("Not enough balance.");
                this.balance();
            }
        };

        Customer diki = new Customer(QR);
        diki.deposit(10000);
        diki.pay(2000);
        diki.pay(3000);
        diki.deposit(1000); 
        
    }
    
}