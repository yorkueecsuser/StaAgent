class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            boolean buggyCondition = false;
            if (buggyCondition) {
                Foo f = new Foo(); 
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
            boolean buggyCondition = false;
            if (buggyCondition) {
                Foo f = new Foo(); 
            }
        }
    }
}