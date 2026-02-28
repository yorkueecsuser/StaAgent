class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            boolean condition = getCondition();
            if (false) {
                Foo f = new Foo(); // Mutant: Unreachable if-else statement
            } else {
                // Some code
            }
        }
    }

    public static class Foo {
        public Foo() {
            // Some code
        }
    }

    public void showBug() {
        for (int i = 0; i < 10; i++) {
            boolean condition = getCondition();
            if (false) {
                Foo f = new Foo(); // Mutant: Unreachable if-else statement
            } else {
                // Some code
            }
        }
    }

    public static boolean getCondition() {
        return false;  // Always return false to make the if-else statement unreachable
    }
}