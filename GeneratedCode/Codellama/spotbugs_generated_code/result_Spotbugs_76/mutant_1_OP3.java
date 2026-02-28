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

        // Unreachable if statement
        if (getCondition()) {
            boolean result = foo.isFoo() && bar.isBar();
            System.out.println(result);
        } else {
            // Dead code
            return;
        }
    }

    // Helper method to generate unreachable code
    private static boolean getCondition() {
        return false;
    }
}