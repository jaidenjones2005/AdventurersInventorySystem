public class Main {

    public static void main(String[] args) {

        Item sword = new Item("Iron Sword", 5.0);
        Item potion = new Item("Health Potion", 0.5);

        System.out.println("=== Adventurer's Inventory ===");

        sword.displayInfo();
        potion.displayInfo();

        System.out.println("\n=== Weight Verification ===");

        System.out.println("Sword Weight: "
                + sword.getWeight() + " lbs");

        System.out.println("Potion Weight: "
                + potion.getWeight() + " lbs");
    }
}