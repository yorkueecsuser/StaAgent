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

    // Mutant code with variable renaming
    public String showBugMutant() {
        A b = (B) () -> "Hello from qux!"; // Casting lambda to B
        return b.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }
}