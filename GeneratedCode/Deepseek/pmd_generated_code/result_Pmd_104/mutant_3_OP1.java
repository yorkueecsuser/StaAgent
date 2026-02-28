class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        String s = "deadstore"; // Mutant: Dead Store
        for (int i = 0; i < 10; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    }

    public static class Foo {
        public Foo() {
            // Some code
        }
    }

    public void showBug() {
        String s = "deadstore"; // Mutant: Dead Store
        for (int i = 0; i < 10; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    }
}