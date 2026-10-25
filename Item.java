public class Item extends InventoryComponent {

    private String name;
    private double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Item: " + name +
                " | Weight: " + weight + " lbs");
    }
}