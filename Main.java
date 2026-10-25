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

        // Create nested gem pouch
        Bag gemPouch = new Bag("Gem Pouch", 0.3);

        gemPouch.add(magicGem);
        bagOfHolding.add(gemPouch);

        // Add nested bags to backpack
        mainBackpack.add(potionPouch);
        mainBackpack.add(bagOfHolding);

        // Display complete inventory
        System.out.println("\n=== Complete Inventory ===");

        mainBackpack.displayInfo();

        System.out.println("\nMain Backpack Total Weight: "
                + mainBackpack.getWeight() + " lbs");

        // Test independent subtree
        System.out.println("\n=== Potion Pouch ===");

        potionPouch.displayInfo();

        System.out.println("Potion Pouch Weight: "
                + potionPouch.getWeight() + " lbs");

        // Test unsupported operation
        System.out.println("\n=== Safety Test ===");

        try {
            sword.add(new Item("Extra Sword", 4.0));
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "Warning: Cannot add items to an individual Item!"
            );
        }

        // PHASE 4 TEST 1: Empty bag
        System.out.println("\n=== Test 1: Empty Bag ===");

        Bag emptyBag = new Bag("Empty Bag", 0.8);

        emptyBag.displayInfo();

        System.out.println("Empty Bag Weight: "
                + emptyBag.getWeight() + " lbs");

        // PHASE 4 TEST 2: Removing an item
        System.out.println("\n=== Test 2: Remove Item ===");

        System.out.println("Weight Before Removal: "
                + potionPouch.getWeight() + " lbs");

        potionPouch.remove(healthPotion);

        System.out.println("Weight After Removal: "
                + potionPouch.getWeight() + " lbs");

        // PHASE 4 TEST 3: Recursive weight update
        System.out.println("\n=== Test 3: Recursive Weight ===");

        System.out.println("Updated Main Backpack Weight: "
                + mainBackpack.getWeight() + " lbs");

        // PHASE 4 TEST 4: Verify expected weight
        System.out.println("\n=== Test 4: Weight Validation ===");

        double expectedWeight = 14.6;
        double actualWeight = mainBackpack.getWeight();

        if (Math.abs(expectedWeight - actualWeight) < 0.000001) {
            System.out.println("PASS: Inventory weight is correct!");
        } else {
            System.out.println("FAIL: Inventory weight is incorrect!");
        }

        System.out.println("\n=== Phase 4 Complete ===");
    }
}