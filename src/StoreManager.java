class StoreManager {
    private String name;

    public StoreManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sellJewelry(Jewelry jewelry, Customer customer) {
        System.out.println(name + " sold " + jewelry.getName() + " to " + customer.getName() + " for $" + jewelry.getPrice());
        customer.addToCollection(jewelry);
    }
}
