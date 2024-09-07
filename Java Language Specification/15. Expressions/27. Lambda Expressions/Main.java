import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // 1. No parameters; does nothing
        Runnable noParamVoid = () -> {
        };
        noParamVoid.run();

        // 2. No parameters, expression body
        Supplier<Integer> return42 = () -> 42;
        Supplier<Object> returnNull = () -> null;

        System.out.println(return42.get());  // Outputs: 42
        System.out.println(returnNull.get());  // Outputs: null

        // 3. No parameters, block body with return
        Supplier<Integer> return42WithBlockBody = () -> {
            return 42;
        };
        System.out.println(return42WithBlockBody.get());

        // 4. declared-type parameter
        Function<Integer, Integer> increment = (Integer x) -> x + 1;
        System.out.println(increment.apply(5));  // Outputs: 6

        // 5. declared-type parameter, block body with return
        Function<Integer, Integer> incrementWithBlockBody = (Integer x) -> {
            return x + 1;
        };
        System.out.println(incrementWithBlockBody.apply(5));  // Outputs: 6

        // 6. inferred-type parameter & parentheses are optional
        Function<Integer, Integer> inferredIncrement = x -> x + 1;
        System.out.println(inferredIncrement.apply(7));  // Outputs: 8

        // 7. Multiple declared-type parameters
        BiFunction<Integer, Integer, Integer> add = (Integer x, Integer y) -> x + y;
        System.out.println(add.apply(2, 3));  // Outputs: 6
    }
}
