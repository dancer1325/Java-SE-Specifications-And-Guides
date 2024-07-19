public class Main {
    public static void main(String[] args) {
        // 1. Instantiate a functional interface instance
        // 1.1 via instantiate a class
        Calculator instantiateAClass = new Addition();
        int result1 = instantiateAClass.operate(5, 3);
        System.out.println("1.1 via instantiate a class " + result1);
        // 1.2 via method reference
        Calculator methodReference = MathUtils::add;    // TODO: Why MathUtils' instance is Calculator type?
        int result2 = methodReference.operate(5, 3);
        System.out.println("1.2 via method reference " + result2);
        // 1.3 via Lambda Expression
        Calculator lambdaExpression = (a, b) -> a + b;
        int result = lambdaExpression.operate(5, 3);
        System.out.println("1.3 via Lambda Expression " + result);
    }
}