class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }

        // Mutation: Add unreachable switch statement in the main method
        int value = 0;
        switch(value) {
            case 1:
                // Unreachable code
                break;
            default:
                break;
        }
    }

    public static class Foo {
        public Foo() {
            // Some code
        }
    }

    public void showBug() {
        for (int i = 0; i < 10; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }

        // Mutation: Add unreachable switch statement in the showBug method
        int value = 0;
        switch(value) {
            case 1:
                // Unreachable code
                break;
            default:
                break;
        }
    }
}