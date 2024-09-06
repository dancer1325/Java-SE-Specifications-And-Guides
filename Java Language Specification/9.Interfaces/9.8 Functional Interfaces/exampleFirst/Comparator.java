package exampleFirst;

// == Func but without extending
@FunctionalInterface
public interface Comparator <T> {
    boolean equals(Object obj);
    int compare(T o1, T o2);
}
