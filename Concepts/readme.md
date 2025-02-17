## 🛠️ SOLID Principles

The **SOLID** principles are a set of five design principles that help in writing maintainable, scalable, and robust object-oriented code.

### 1️⃣ **Single Responsibility Principle (SRP)**
   - A class should have **only one reason to change**.
   - It should perform **one single responsibility** and **encapsulate only one functionality**.
   - **Why?** This makes the code more maintainable and reduces the impact of changes.

### 2️⃣ **Open/Closed Principle (OCP)**
   - **Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.**
   - We should be able to add new functionality without modifying the existing code.
   - **Why?** This prevents breaking existing code when adding new features.

### 3️⃣ **Liskov Substitution Principle (LSP)**
   - **If class B is a subtype of class A, we should be able to replace instances of A with B without breaking the program.**
   - Subclasses should extend the behavior of a base class **without altering its intended functionality**.
   - **Why?** Ensures that derived classes can be used interchangeably with their base classes.

### 4️⃣ **Interface Segregation Principle (ISP)**
   - **A client should not be forced to implement methods it does not use.**
   - Instead of a single large interface, multiple small and specific interfaces should be preferred.
   - **Why?** This avoids unnecessary dependencies and makes the system more modular.

### 5️⃣ **Dependency Inversion Principle (DIP)**
   - **High-level modules should not depend on low-level modules. Instead, both should depend on abstractions (interfaces).**
   - This ensures that dependencies are managed through interfaces rather than concrete implementations.
   - **Why?** It improves flexibility, reduces coupling, and makes the system easier to modify.

---

By following these **SOLID** principles, we can design systems that are **scalable, maintainable, and robust** while reducing technical debt! 🚀
