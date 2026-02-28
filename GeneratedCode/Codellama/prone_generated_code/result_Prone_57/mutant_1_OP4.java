import java.util.function.Function;

class FunctionalInterfaceMethodChanged {
    public static void main(String[] args) {
        Function<String, String> foo = (s) -> "Foo";
        Function<String, String> bar = (s) -> "Bar";
        System.out.println(foo.apply("Hello")); // Outputs "Foo"
        System.out.println(bar.apply("World")); // Outputs "Bar"
        System.out.println(foo.compose(bar).apply("Hello World")); // Outputs "FooBar"
        System.out.println(bar.compose(foo).apply("Hello World")); // Outputs "BarFoo"

        // Mutant 1: Unreachable if-else statement
        if (false) {
            // unreachable code
        } else {
            // unreachable code
        }

        // Mutant 2: Unreachable while loop
        while (false) {
            // unreachable code
        }

        // Mutant 3: Unreachable for loop
        for (int i = 0; false; i++) {
            // unreachable code
        }

        // Mutant 4: Unreachable if-else statement in switch case
        switch (0) {
            case 1:
                // unreachable code
                break;
            default:
                // unreachable code
                break;
        }
    }
}