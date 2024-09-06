package exampleFirst;

// subinterface of a NOT allowed, but it adds a valid method abstract to mark as functional interface
@FunctionalInterface
public interface Func extends NonFunc {
    int compare(String o1, String o2);
}
