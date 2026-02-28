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

// Mutant 1: Renaming the variable `foo` to `a`
class FunctionalInterfaceMethodChanged {
    public static void main(String[] args) {
        Function<String, String> a = (s) -> "Foo";
        Function<String, String> bar = (s) -> "Bar";
        System.out.println(a.apply("Hello")); // Outputs "Foo"
        System.out.println(bar.apply("World")); // Outputs "Bar"
        System.out.println(a.compose(bar).apply("Hello World")); // Outputs "FooBar"
        System.out.println(bar.compose(a).apply("Hello World")); // Outputs "BarFoo"
    }
}

// Mutant 2: Renaming the variable `bar` to `b`
class FunctionalInterfaceMethodChanged {
    public static void main(String[] args) {
        Function<String, String> foo = (s) -> "Foo";
        Function<String, String> b = (s) -> "Bar";
        System.out.println(foo.apply("Hello")); // Outputs "Foo"
        System.out.println(b.apply("World")); // Outputs "Bar"
        System.out.println(foo.compose(b).apply("Hello World")); // Outputs "FooBar"
        System.out.println(b.compose(foo).apply("Hello World")); // Outputs "BarFoo"
    }
}