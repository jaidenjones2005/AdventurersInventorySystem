import java.util.ArrayList;

public class Bag extends InventoryComponent {

    private String name;
    private double baseWeight;
    private ArrayList<InventoryComponent> items;

    public Bag(String name, double baseWeight) {
        this.name = name;
        this.baseWeight = baseWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(InventoryComponent component) {
        items.add(component);
    }

    @Override
    public void remove(InventoryComponent component) {
        items.remove(component);
    }

    @Override
    public InventoryComponent getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        double totalWeight = baseWeight;

        for (InventoryComponent component : items) {
            totalWeight += component.getWeight();
        }

        return totalWeight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bag: " + name +
                " | Base Weight: " + baseWeight + " lbs");

        for (InventoryComponent component : items) {
            component.displayInfo();
        }
    }
}