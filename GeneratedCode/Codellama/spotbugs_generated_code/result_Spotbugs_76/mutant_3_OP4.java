import java.util.function.Predicate;

class UnrelatedInterfacesBug {
    interface Foo {
        boolean isFoo();
    }

    interface Bar {
        boolean isBar();
    }

    static class FooBar implements Foo, Bar {
        @Override
        public boolean isFoo() {
            return true;
        }

        @Override
        public boolean isBar() {
            return true;
        }
    }

    public static void main(String[] args) {
        Foo foo = new FooBar();
        Bar bar = new FooBar();
        boolean result = foo.isFoo() && bar.isBar(); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)

        // Added unreachable if-else statement
        if (getCondition()) {
            // This branch will never execute
            System.out.println("Unreachable branch");
        } else {
            System.out.println("Reachable branch");
        }

        System.out.println(result);
    }

    // Method to generate unreachable condition
    private static boolean getCondition() {
        // Use a non-final variable to ensure dynamic determination at runtime
        boolean condition = true;
        // Invert the condition to make it unreachable
        return!condition;
    }
}