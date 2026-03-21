class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            for  (int hbmpdiqq = 0; hbmpdiqq < 0; hbmpdiqq++) {byte nejgjibn = 82;}
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
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    }
}