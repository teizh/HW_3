public class Main {
    public static void main(String[] args)  {

        BankAccount optima = new BankAccount(20000);
        while (true) {
            try {
                optima.withDraw(6000);
                System.out.println("Successful withdrawal of 6000 som" +
                        " Remaining amount: "+optima.getAmount()+ " som.");
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                try {
                    optima.withDraw((int) le.getRemainingAmount());
                } catch (LimitException e) {

                    System.out.println(e.getRemainingAmount());
                }
                System.out.println("Successful withdrawal of "+ le.getRemainingAmount());
                break;
            }
        }
        System.out.println("Remaining amount "+optima.getAmount()+ " som");
    }
}