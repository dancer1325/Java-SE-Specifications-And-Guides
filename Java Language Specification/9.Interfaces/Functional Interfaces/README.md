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
* let interface "I" / NOT `sealed` + let "M" set of `abstract` methods / members of "I" & signature != ANY "java.lang.Object" 's public method
  * 👁️ "I" is a functional interface, if exist method "m" | "M" / 👁️ 
    * "m"'s signature ==  subsignature of every "M"'s method signatures & 
      * subsignature -- Check '../../8.Classes/Method Declarations' -- 
    * "m" is return-type-substitutable | ALL "M"'s methods
      * Check '../../8.Classes/Method Declarations'
* ways to create an interface instance
  * declare & instantiate a class
    * Check '../../15.Expressions/Class Instance Creation Expressions'
  * method reference expressions
    * Check '../../15.Expressions/Method Reference Expressions'
  * lambda expressions
    * Check '../../15.Expressions/Lambda Expressions'
* TODO: From "The definition of functional interface excludes methods in an interface that are also public methods in Object. "

## How to run locally?
* `javac Main.java`
* `java Main`