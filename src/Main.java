public class Main {
    public static void main(String[] args) {

        BankAccount optima = new BankAccount(20000);
        while (true) {
            try {
                optima.withDraw(6000);
                System.out.println("Successful withdrawal of 6000 som" +
                        " Remaining amount: "+optima.getAmount()+ " som.");
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                System.out.println("Successful withdrawal of "+ le.getRemainingAmount());
                break;
            }
        }
    }
}