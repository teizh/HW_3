public class Main {
    public static void main(String[] args) {

        BankAccount optima = new BankAccount(20000);
        while (true) {
            try {
                optima.withDraw(6000);
                System.out.println("Uspeshno snyaty sredstva");
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                break;
            }


        }


    }
}