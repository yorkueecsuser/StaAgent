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
        boolean result = foo.isFoo() && bar.isBar();
        if (getCondition()) { // Unreachable if statement
            System.out.println("Unreachable code path!");
        } else {
            System.out.println(result);
        }
    }

    // Helper method to get a non-final variable or equivalent method call
    private static boolean getCondition() {
        return Math.random() > 0.5;
    }
}