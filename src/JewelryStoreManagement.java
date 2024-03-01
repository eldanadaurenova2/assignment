public class JewelryStoreManagement {
    public static void main(String[] args) {


        Jewelry necklace = new Jewelry("Алқа", 10000);
        Jewelry ring = new Jewelry("Бес билезик", 8000);

        Customer customer = new Customer("Eldana");

        StoreManager manager = new StoreManager("Aigerim");

        manager.sellJewelry(necklace, customer);
        manager.sellJewelry(ring, customer);

        customer.displayCollection();
    }
}
