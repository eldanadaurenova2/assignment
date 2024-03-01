import java.util.List;
import java.util.ArrayList;

class Customer {
    private String name;
    private List<Jewelry> jewelryCollection;

    public Customer(String name) {
        this.name = name;
        this.jewelryCollection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addToCollection(Jewelry jewelry) {
        jewelryCollection.add(jewelry);
        System.out.println(name + " added " + jewelry.getName() + " to her collection.");
    }

    public void displayCollection() {
        System.out.println("Jewelry collection of " + name + ":");
        for (Jewelry jewelry : jewelryCollection) {
            System.out.println("- " + jewelry.getName() + " ($" + jewelry.getPrice() + ")");
        }
    }
}
