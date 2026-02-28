import java.util.function.Function;

class FunctionalInterfaceMethodChanged {
    public static void main(String[] args) {
        Function<String, String> foo = (s) -> "Foo";
        Function<String, String> bar = (s) -> "Bar";
        System.out.println(foo.apply("Hello")); // Outputs "Foo"
        System.out.println(bar.apply("World")); // Outputs "Bar"
        System.out.println(foo.compose(bar).apply("Hello World")); // Outputs "FooBar"
        System.out.println(bar.compose(foo).apply("Hello World")); // Outputs "BarFoo"
    }
}
// Mutant 1: Duplicate the assignment statement for "foo" and insert it immediately after its current location.
Function<String, String> foo = (s) -> "Foo";
Function<String, String> foo = (s) -> "Foo";
// Mutant 2: Duplicate the assignment statement for "bar" and insert it immediately after its current location.
Function<String, String> bar = (s) -> "Bar";
Function<String, String> bar = (s) -> "Bar";