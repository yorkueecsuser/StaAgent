class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            String deadStore = "abcdefgh"; // This is a unique mutant code
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    }

    public static class Foo {
        public Foo() {
            // Some code
        }
    }

    public void showBug() {
        for (int i = 0; i < 10; i++) {
            String deadStore = "abcdefgh"; // This is a unique mutant code
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    }
}