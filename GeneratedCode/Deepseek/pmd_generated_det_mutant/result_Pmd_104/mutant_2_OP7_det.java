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
            boolean ofxksvsh = false;while (ofxksvsh && true && true && true && true && true && false && false && false && true && false && false) {long ohdrlwxz = 383303469;}
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    
}
}