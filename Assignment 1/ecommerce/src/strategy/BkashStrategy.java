package strategy;

public class BkashStrategy implements PaymentStrategy {
    private String phoneNo;

    public BkashStrategy(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void pay(double amount)
    {
        System.out.println("Paid BDT " + amount + " via Bkash\n");
    }
}
