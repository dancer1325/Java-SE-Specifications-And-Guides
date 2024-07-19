# Goal
* [Official documentation](https://docs.oracle.com/javase/specs/jls/se22/html/jls-9.html#jls-9.8)

* := interface / NOT declared `sealed` & 1! `abstract` method (WITHOUT considering `java.lang.Object`'s methods)
  * -> == 1! function contract
  * ⭐if an interface inherits from > 1 interface & 👁️ interface's methods have same signature 👁️ -- it could be still be a -> functional interface ⭐

    ```
    @FunctionalInterface
    interface InterfaceA {
        void doSomething(String input);
    }
    @FunctionalInterface
    interface InterfaceB {
        void doSomething(String input);    // InterfaceB's doSomething signature == InterfaceA's doSomething signature 
    }
    @FunctionalInterface
    interface CombinedInterface extends InterfaceA, InterfaceB {
        // No additional abstract methods
    }

    ```
* TODO: