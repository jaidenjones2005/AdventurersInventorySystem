public class Main {

    public static void main(String[] args) {

        System.out.println("=== Adventurer's Inventory ===");

        Item sword = new Item("Iron Sword", 5.0);
        Item potion = new Item("Health Potion", 0.5);
        Item gem = new Item("Magic Gem", 0.2);

        System.out.println("\n=== Individual Items ===");

        sword.displayInfo();
        potion.displayInfo();

        System.out.println("\n=== Belt Pouch ===");

        Bag beltPouch = new Bag("Belt Pouch", 0.5);

        beltPouch.add(potion);
        beltPouch.add(gem);

        beltPouch.displayInfo();

        System.out.println("\n=== Weight Verification ===");

        System.out.println("Belt Pouch Total Weight: "
                + beltPouch.getWeight() + " lbs");
    }
}