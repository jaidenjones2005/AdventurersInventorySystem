public class Main {

    public static void main(String[] args) {

        System.out.println("=== Adventurer's Inventory System ===");

        // Create individual items
        Item sword = new Item("Iron Sword", 5.0);
        Item bedroll = new Item("Bedroll", 3.0);
        Item rope = new Item("Rope", 2.0);
        Item healthPotion = new Item("Health Potion", 0.5);
        Item manaPotion = new Item("Mana Potion", 0.5);
        Item magicGem = new Item("Magic Gem", 0.2);
        Item ancientScroll = new Item("Ancient Scroll", 0.1);

        // Create main backpack
        Bag mainBackpack = new Bag("Main Backpack", 2.0);

        // Add loose items
        mainBackpack.add(sword);
        mainBackpack.add(bedroll);
        mainBackpack.add(rope);

        // Create potion pouch
        Bag potionPouch = new Bag("Potion Pouch", 0.5);

        potionPouch.add(healthPotion);
        potionPouch.add(manaPotion);

        // Create Bag of Holding
        Bag bagOfHolding = new Bag("Bag of Holding", 1.0);

        bagOfHolding.add(ancientScroll);

        // Create deeply nested gem pouch
        Bag gemPouch = new Bag("Gem Pouch", 0.3);

        gemPouch.add(magicGem);

        // Place gem pouch inside Bag of Holding
        bagOfHolding.add(gemPouch);

        // Add smaller bags to main backpack
        mainBackpack.add(potionPouch);
        mainBackpack.add(bagOfHolding);

        // Display complete inventory
        System.out.println("\n=== Complete Inventory ===");

        mainBackpack.displayInfo();

        // Calculate total weight
        System.out.println("\n=== Total Inventory Weight ===");

        System.out.println("Main Backpack Total Weight: "
                + mainBackpack.getWeight() + " lbs");

        // Demonstrate independent subtree operations
        System.out.println("\n=== Potion Pouch Inventory ===");

        potionPouch.displayInfo();

        System.out.println("Potion Pouch Total Weight: "
                + potionPouch.getWeight() + " lbs");

        // Demonstrate exception handling
        System.out.println("\n=== Safety Test ===");

        try {
            sword.add(new Item("Extra Sword", 4.0));
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "Warning: Cannot add items to an individual Item!"
            );
        }

        System.out.println("\n=== Phase 3 Complete ===");
    }
}