public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double deposit(Double sum) {
        amount = amount + sum;
        return amount;
    }

    public void withDraw(Integer sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Can not withdraw this amount, " +
                    "not enough money.", amount  );

        } else amount = amount - sum;
    }


}
