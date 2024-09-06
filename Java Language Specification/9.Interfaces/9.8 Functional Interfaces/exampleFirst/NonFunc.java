package exampleFirst;

// NOT allowed to declare as functional interface, because `boolean equals(Object obj);` is a `java.lang.Object`'s member
//@FunctionalInterface          // Uncomment to check the error highlighted by the IDE
public interface NonFunc {
    boolean equals(Object obj);
}
