// 4. ways to have member methods abstract
abstract class AbstractClass {
    int x = 10; // Field initializer

    AbstractClass() {
        System.out.println("AbstractClass constructor called");
    }

    // 4.1 declare explicitly
    abstract void doSomething(); // Abstract method
    // package access, by default
}

abstract class AnotherAbstractClass extends AbstractClass {
    // 4.2 inherited the abstract methods & NOT implement it   -- doSomething() --
}

class ConcreteClass extends AbstractClass {
    int y = 20; // Field initializer

    ConcreteClass() {
        System.out.println("ConcreteClass constructor called");
    }

    @Override
    void doSomething() {
        System.out.println("Doing something");
    }

    // 3. abstract methods NOT allowed to be declared | NON-abstract classes, else -> compile-time error
    //abstract void notAllowedMethod();             // Uncomment to get the error
}

// 5. NOT possible to create subclass / implement Colored -> compile-time error
// Reason: methods almost with same signature, BUT different return type -> IMPOSSIBLE to implement a subclass of Colored
// uncomment to check
interface Colorable {
    void setColor(int color);
}
abstract class Colored implements Colorable {
    public abstract int setColor(int color);
}

// 6. NOT use abstract, if you just SIMPLY want to prevent instantiation
public final class Math {
    private Math() { }  // never instantiate this class
    // . . . declarations of class variables and methods . . .
}

public class ClassModifiersAbstract {
    public static void main(String[] args) {
        // 1. abstract class's constructor tried to be used -> compile-time error
        // AbstractClass abstractClass = new AbstractClass();           // Uncomment to get the error
        // 2. abstract class's constructor is invoked -- via -- subclass instantiation
        ConcreteClass obj = new ConcreteClass();
        System.out.println("x = " + obj.x); // Accessing inherited field
        System.out.println("y = " + obj.y); // Accessing own field
    }
}
