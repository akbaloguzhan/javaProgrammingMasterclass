public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer1 = new Customer("Teoman", "teo@gmail.com");

        System.out.println("Name: " + customer1.getName() + " Credit Limit: " + customer1.getCreditLimit() +
                " Email: " + customer1.getEmailAddress());
    }
}