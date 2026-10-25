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

