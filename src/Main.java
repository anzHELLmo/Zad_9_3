public class Main {
    public static void main(String[] args) {
        Account account = new Account("Donald Trump", 10, "123456789");

        try {
            account.transfer(15);
            System.out.println("Transfer completed successfully.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("An exception occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Finally: Current balance is " + account.getBalance());
        }
    }
}
