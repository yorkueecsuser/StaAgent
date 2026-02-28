import java.util.function.Function;

class FunctionalInterfaceExample {

    @FunctionalInterface
    interface A {
        String bar();
    }

    @FunctionalInterface
    interface B extends A {
        String qux();

        @Override
        default String bar() {
            return "Default from B"; // BUG: FunctionalInterfaceMethodChanged
        }
    }

    public String showBug() {
        A a = (B) () -> "Hello from qux!"; // Casting lambda to B
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}

// Mutant added with a user-defined variable renamed
class FunctionalInterfaceExampleMutant {

    @FunctionalInterface
    interface A {
        String bar();
    }

    @FunctionalInterface
    interface B extends A {
        String qux();

        @Override
        default String bar() {
            return "Default from B";
        }
    }

    public String showBug() {
        A b = (B) () -> "Hello from qux!"; // Renamed variable from 'a' to 'b'
        return b.bar();
    }

    public static void main(String[] args) {
        FunctionalInterfaceExampleMutant example = new FunctionalInterfaceExampleMutant();
        System.out.println(example.showBug());
    }
}