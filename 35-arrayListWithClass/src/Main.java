import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer ali = new Customer(1, "Ali", "Veli");
        customers.add(ali);
        customers.add(new Customer(2, "Zeki", "Çoşar"));
        customers.add(new Customer(3, "Ahmet", "Kaçar"));

        customers.remove(ali);

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}
