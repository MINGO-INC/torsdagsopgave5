public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Client Information: \n" +
                "Name: " + getFirstName() + " "+getLastName() + "\n" +
                "Username: " + getUsername();
    }

}