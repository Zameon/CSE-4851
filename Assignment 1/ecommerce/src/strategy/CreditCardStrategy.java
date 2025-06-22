package strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNo;

    public CreditCardStrategy(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public void pay(double amount)
    {
        System.out.println("Paid BDT " + amount + " via Credit Card\n");
    }
}
