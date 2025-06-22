# E-commerce Order Processing System

A sample Java-based e-commerce application demonstrating four classic design patterns—Factory, Strategy, Decorator, and Template Method—to achieve modular, extensible, and maintainable code.

---

## Table of Contents

1. [Overview](#overview)
2. [Design Patterns](#design-patterns)

   * [Factory Pattern](#factory-pattern)
   * [Strategy Pattern](#strategy-pattern)
   * [Decorator Pattern](#decorator-pattern)
   * [Template Method Pattern](#template-method-pattern)
3. [Package Structure](#package-structure)
---

## Overview

This project simulates order processing in an online store. We apply:

* **Factory Pattern** to create product objects by type (e.g., Book, Electronics).
* **Strategy Pattern** to encapsulate payment algorithms (CreditCard, PayPal).
* **Decorator Pattern** to add cross-cutting concerns (logging, notifications) to the core order service.
* **Template Method Pattern** to define a reusable skeleton for processing different order types (standard, preorder).

---

## Design Patterns

### Factory Pattern

**Component**: `ProductFactory`
**Responsibility**: Instantiate concrete `Product` subclasses (`Book`, `Electronics`) based on a type string.

### Strategy Pattern

**Component**: `PaymentStrategy` interface
**Responsibility**: Encapsulate payment algorithms. Implementations include:

* `CreditCardStrategy`
* `PayPalStrategy`

### Decorator Pattern

**Component**: `OrderServiceDecorator` (abstract)
**Responsibility**: Wrap an `OrderService` to add behaviors. Concrete decorators:

* `LoggingDecorator` — logs around order placement
* `NotificationDecorator` — sends a notification after placement

### Template Method Pattern

**Component**: `OrderProcessor` (abstract)
**Responsibility**: Define the steps of `processOrder()`—validate, place payment, ship—and allow subclasses to override hooks. Concrete processors:

* `StandardOrderProcessor`
* `PreorderProcessor`

---

## Package Structure

```
src/
├── App.java
├── factory/
│   └── ProductFactory.java
├── model/
│   ├── Order.java
│   └── Product.java
├── model/products/
│   ├── Book.java
│   └── Electronics.java
├── strategy/
│   ├── PaymentStrategy.java
│   ├── CreditCardStrategy.java
│   └── BkashStrategy.java
├── service/
│   ├── OrderService.java
│   ├── BasicOrderService.java
│   └── decorator/
│       ├── OrderServiceDecorator.java
│       ├── LoggingDecorator.java
│       └── EmailNotifDecorator.java
└── template/
    ├── OrderProcessor.java
    ├── StandardProcessor.java
    └── PreorderProcessor.java
```

---


