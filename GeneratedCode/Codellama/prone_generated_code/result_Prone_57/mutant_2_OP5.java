import java.util.function.Function;

class FunctionalInterfaceMethodChanged {
    public static void main(String[] args) {
        Function<String, String> foo = (s) -> "Foo";
        Function<String, String> bar = (s) -> "Bar";
        System.out.println(foo.apply("Hello")); // Outputs "Foo"
        System.out.println(bar.apply("World")); // Outputs "Bar"
        System.out.println(foo.compose(bar).apply("Hello World")); // Outputs "FooBar"
        System.out.println(bar.compose(foo).apply("Hello World")); // Outputs "BarFoo"
        
        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }
    
    // Method to generate unreachable switch expression
    private static int getValue() {
        return 0;
    }
}