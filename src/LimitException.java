public class LimitException extends Exception {
    private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message) {
        super(message);

    }


}

