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
        if (false) {
            // Unreachable if-else branch
            System.out.println("This is an unreachable branch.");
        } else {
            System.out.println(result);
        }
    }
}