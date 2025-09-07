# Age of Villagers (AoV) - Village Creation Module

This project implements part of a game named **Age of Villagers (AoV)**.  
The focus is on the **village creation process**, which is modeled using multiple **design patterns** for clean, extensible, and maintainable architecture.

---

## Scenario

A village can have several types of objects such as **houses**, **trees**, and **water sources**, which are created by combining simple **geometric shapes**.

The user can choose between two village styles:

- **Modern Village**  
  - Brick House  
  - Mango Tree  
  - Swimming Pool  

- **Traditional Village**  
  - Mud House  
  - Banana Tree  
  - Pond  

---

## Applied Design Patterns

### 1. Composite Pattern (Core Pattern)

Used for **hierarchical structuring** of objects.

- **Component**:  
  `VillageComponent`  
  - Declares common operations for both simple and composite objects.  
  - Methods: `add()`, `remove()`, `getChild()`, `display()`, `getName()`  
  - Allows clients to manipulate **leaves** and **composites** uniformly.

- **Leaf**:  
  `Shape`, `CircleShape`, `RectangleShape`, `TriangleShape`, `EllipseShape`  
  - Represent primitive geometric building blocks (e.g., walls, roof, doors, trunks, crowns, water).  
  - Do not support children (throw `UnsupportedOperationException` for `add/remove/getChild`).  

- **Composite**:  
  `CompositeComponent`  
  - Stores children in a `List<VillageComponent>`.  
  - Implements `add()`, `remove()`, `getChild()`.  
  - Implements `display()` by delegating to children recursively.  

This allows building complex structures (houses, trees, water sources, villages) from simpler shapes.

---

### 2. Builder Pattern

Used for **step-by-step assembly** of complex village components.

- **HouseBuilder**  
  - Concrete implementations: `BrickHouseBuilder`, `MudHouseBuilder`  

- **TreeBuilder**  
  - Concrete implementations: `MangoTreeBuilder`, `BananaTreeBuilder`  

- **WaterSourceBuilder**  
  - Concrete implementations: `SwimmingPoolBuilder`, `PondBuilder`  

 The **Village Factory** orchestrates construction by calling the builders in a fixed order, then aggregates them into a **Village composite**.

---

### 3. Abstract Factory Pattern

Used to **hide the creation logic** from the client.

- **Factory Interface**:  
  `VillageFactory`  
  - Declares method `createVillage(name)`  

- **Concrete Factories**:  
  - `ModernVillageFactory`  
  - `TraditionalVillageFactory`  

- **Factory Producer**:  
  `FactoryProducer`  
  - Provides a static method `getFactory(type)` to return the correct factory.  

 The client code only interacts with `FactoryProducer` to get a village, without knowing which concrete classes are used.

---

## Architecture Overview

```text
Client (main)
   │
   ▼
FactoryProducer → VillageFactory (interface)
   │
   ├── ModernVillageFactory (Brick House + Mango Tree + Swimming Pool)
   └── TraditionalVillageFactory (Mud House + Banana Tree + Pond)
        │
        ▼
     Builders (HouseBuilder, TreeBuilder, WaterSourceBuilder)
        │
        ▼
  Composite Pattern (VillageComponent, CompositeComponent, Shape)
```

  ## Package Structure

```text
src/
├── App.java
├── Builder/
    └── House/
        |── HouseBuilder.java
        |── BrickHouse.java
        └── MudHouse.java
    └── Tree/
        |── TreeBuilder.java
        |── MangoTree.java
        └── BananaTree.java
    └── Water_Source/
        |── WaterSourceBuilder.java
        |── SwimmingPool.java
        └── Pond.java
├── Component/
    └── VillageComponent.java
├── Composite
    └── CompositeComponent.java
├── Leaf/
    ├── Shape.java
    ├── RectangleShape.java
    |── CircleShape.java
    |── TriangleShape.java
    └── EllipseShape.java
├── Viilage_Factory/
    ├── FactoryProducer.java
    ├── ModernVillage.java
    |── TraditionalVillage.java
    └── VillageFactory.java
```
