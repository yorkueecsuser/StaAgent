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
        System.out.println(result);
    }
}

// Mutation Operator: Unreachable for loop
// Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.

// Generated Mutated Java Code:
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
        System.out.println(result);

        // Mutation Operator: Unreachable for loop
        for (int i = 0; false; i++) {
            // Unreachable code
            result = false;
        }
    }
}