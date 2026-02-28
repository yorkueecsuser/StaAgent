class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        boolean isUnreachable = false;
        for (int i = 0; i < 10; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            if (isUnreachable) {
                System.out.println("Unreachable code");
            }
        }
    }

    public static class Foo {
        public Foo() {
            // Some code
        }
    }

    public void showBug() {
        boolean isUnreachable = false;
        for (int i = 0; i < 10; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            if (isUnreachable) {
                System.out.println("Unreachable code");
            }
        }
    }
}