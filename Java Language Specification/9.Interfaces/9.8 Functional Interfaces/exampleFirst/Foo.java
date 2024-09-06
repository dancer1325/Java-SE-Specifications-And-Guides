package exampleFirst;

// NOT valid, because 2 abstracts methods / NOT public members of `java.lang.Object`
//@FunctionalInterface          // Uncomment to check the error highlighted by the IDE
public interface Foo {
    int m();
    Object clone();
}
