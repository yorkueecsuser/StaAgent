import java.util.function.Function;

class FunctionalInterfaceMethodChanged {
    public static void main(String[] args) {
        Function<String, String> f = (s) -> "Foo";
        Function<String, String> b = (s) -> "Bar";
        System.out.println(f.apply("Hello")); // Outputs "Foo"
        System.out.println(b.apply("World")); // Outputs "Bar"
        System.out.println(f.compose(b).apply("Hello World")); // Outputs "FooBar"
        System.out.println(b.compose(f).apply("Hello World")); // Outputs "BarFoo"
    }
}