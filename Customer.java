public class Customer {
    private String customerId;
    private String name;
    private String Mob;

    public Customer(String customerId, String name, String Mob) {
        this.customerId = customerId;
        this.name = name;
        this.Mob = Mob;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getMob() {
        return Mob;
    }
}
