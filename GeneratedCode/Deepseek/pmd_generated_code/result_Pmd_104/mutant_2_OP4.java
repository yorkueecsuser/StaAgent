class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        boolean condition = false;
        if (condition) {
            for (int i = 0; i < 10; i++) {
                Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            }
        } else {
            System.out.println("Unreachable code");
        }
    }

    public static class Foo {
        public Foo() {
            // Some code
        }
    }

    public void showBug() {
        boolean condition = false;
        if (condition) {
            for (int i = 0; i < 10; i++) {
                Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            }
        } else {
            System.out.println("Unreachable code");
        }
    }
}