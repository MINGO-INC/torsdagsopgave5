import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Jeppe","Koch","JeppeRK"));
        customers.add(new Customer("Warren","Zaire Emery","WZR"));
        //System.out.println(customers.toString());
        // System.out.println();
        printCustomers(customers);
    }
    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer c:customers){

            System.out.println(c.toString());

        }
    }
}
