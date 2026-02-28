class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            Foo f1 = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            Foo f2 = new Foo(); // Duplicated code
        }
    }

    public static class Foo {
        public Foo() {
            // Some code
        }
    }

    public void showBug() {
        for (int i = 0; i < 10; i++) {
            Foo f1 = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            Foo f2 = new Foo(); // Duplicated code
        }
    }
}