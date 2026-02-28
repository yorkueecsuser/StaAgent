import java.util.function.Function;

class FunctionalInterfaceMethodChanged {
    public static void main(String[] args) {
        Function<String, String> foo = (s) -> "Foo";
        Function<String, String> bar = (s) -> "Bar";
        System.out.println(foo.apply("Hello")); // Outputs "Foo"
        System.out.println(bar.apply("World")); // Outputs "Bar"
        System.out.println(foo.compose(bar).apply("Hello World")); // Outputs "FooBar"
        System.out.println(bar.compose(foo).apply("Hello World")); // Outputs "BarFoo"

/* Unreachable while loop added */
        while (false) {
            System.out.println("This code is unreachable");
        }
    }
}