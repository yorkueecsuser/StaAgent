class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
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
        for (int i = 0; i < 10; i++) {
            if (true && true && true && false && false && true && false && false && false && false && false) {boolean ubdlwwff = true;}else{char yurxntkt = 'd';}
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    
}
}