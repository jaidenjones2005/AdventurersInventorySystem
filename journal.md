# Adventurer's Inventory System Journal

## Phase 1: The Core Gear

In Phase 1, I created the InventoryComponent abstract class
and the Item class. I also tested two different items
to verify their names and weights displayed correctly.

InventoryComponent provides default methods that throw
UnsupportedOperationException because not every component
supports every operation. For example, an Item cannot
contain other items, so it should not support add or remove.

This design emphasizes transparency because clients can
use the same InventoryComponent interface for both
individual items and containers without needing separate
interfaces.

## Phase 2: Nested Containers and Recursion

In Phase 2, I created the Bag class, which extends
InventoryComponent. The Bag class can store individual
items and other containers using an ArrayList.

The getWeight() method works differently in Item and Bag.
Item simply returns its own weight, while Bag calculates
its base weight plus the weight of every component inside.

Polymorphism allows Bag to call getWeight() on each
InventoryComponent without knowing whether it is an
Item or another Bag. Recursion happens automatically
when a nested Bag calculates the weight of its contents.

This makes the inventory system flexible and allows
containers to hold other containers.

## Phase 3: Full Adventurer Inventory

In Phase 3, I created a complete adventurer inventory
using multiple levels of nested containers.

The Main Backpack contains individual items and smaller
bags, including a Potion Pouch and a Bag of Holding.
The Bag of Holding also contains a Gem Pouch.

I tested displayInfo() and getWeight() on the entire
inventory and on the Potion Pouch independently.

I also demonstrated exception handling by attempting
to add an item to a sword, which correctly threw an
UnsupportedOperationException.

If I wanted to add a WeightlessBag, I could create a
new subclass of InventoryComponent and customize its
getWeight() method.

I would not need to modify Item, Bag, or the existing
InventoryComponent interface.

This supports the Open/Closed Principle because the
system can be extended with new container types
without modifying existing classes.

## Phase 4: Validation and Reflection

In Phase 4, I tested the Adventurer's Inventory System
to verify that the Composite pattern works correctly.

First, I tested an empty bag and confirmed that it
returned only its base weight without crashing.

Next, I removed a Health Potion from the Potion Pouch.
The pouch's weight decreased from 1.5 lbs to 1.0 lbs.

I also verified that removing the potion automatically
updated the Main Backpack's total weight from
15.1 lbs to 14.6 lbs.

These tests demonstrated that recursive weight
calculations work correctly across nested containers.

One important edge case was making sure empty bags
could calculate their weight without any child items.

I also confirmed that unsupported operations on
individual items are handled using exceptions.

I did not need to modify the existing Composite
pattern structure to complete these tests.

Overall, the Composite pattern makes it easier
to manage individual items and nested containers
through the same interface.