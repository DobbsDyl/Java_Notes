/*
OBJECT ORIENTED PROGRAMMING - OOP

- paradigm centered around objects that bundle data (fields) and methods (behaviour)
- ***Java is a fully object orinted language***

- Object: instance of a class
- Class: blueprint for objects
*/

/*
4 PILLARS OF OOP

1. Encapsulation:
    a. hide internal state of object and only expose controlled interface to interact with
    b. achieved using access modifiers
        - private
        - public
        - protected
*/
class Person {
    private String name; // this field is encapsulated

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
2. Inheritance:
    a. enbales a class to aquire properties of another class (supports code reuse and polymorphism)
    b. uses extend keyword
*/
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal { // Dog class can also call the eat method in the Animal class
    void bark() {
        System.out.println("This dog barks");
    }
}

/*
3. Polymorphism:
    a. Allows one entity (method/object) to take on multiple forms
    b. Done in two ways:
        - Method Overriding (compile-time)
        - Method Overloading (runtime)
            - can overload based on param list (datatype, # params), return type (+ params)
            - cannot overload based on access modifier, or the return type alone (must have different params)
            - static methods and class constructors can also be overloaded
*/
// Overloading
class Calculator {
    int add(int x, int y) {
        return x + y;
    }

    double add (double x, double y) {
        return x + y;
    }
}

// Overriding
class Car {
    void sound() {
        System.out.println("Car makes a noise");
    }
}

class Ferrari extends Car {
    @Override
    void sound() {
        System.out.println("Vrrrrrrm Vrm");
    }
}

/*
4. Abstraction 
    a. hides implementation details, acheived through abstract classes or interfaces
*/
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}


/*
JAVA CLASSES

    a. made up of fields, constructors, and methods
    b. types of classes:
        - Concrete: regular class that can be instantiated
        - Abstract: cannot be instantiated, can hold abstract & concrete methods
        - Nested: A class can be defined inside another class
        - Singleton: ensures only one instance of the class exists
    
    c. important keywords:
        - this: refers to current object (this.fieldName, this.methodName())
        - super: refers to parent class
        - final: prevent modification (variable, method, class)

JAVA INTERFACES

    a. characteristics:
        - all methods are abstract implicitly (Java 8 allows default/static methods)
        - variables in interfaces are public static final (constants)
        - classes can implment multiple interfaces (multiple inheritance)
    b. Static and Default methods:
        -default: provides a default implmentation
        -static: belong to the interface
*/
interface Flyable {
    void fly();
    default void flySound() {
        System.out.println("Flap Flap");
    }
}
interface Swimmable {
    void swim();
    static void swimSound() {
        System.out.println("swoosh Swoosh");
    }
}
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies.");
    }
    public void swim() {
        System.out.println("Duck swims.");
    }
}



public class i_oop_interfaces_classes {
    
}
