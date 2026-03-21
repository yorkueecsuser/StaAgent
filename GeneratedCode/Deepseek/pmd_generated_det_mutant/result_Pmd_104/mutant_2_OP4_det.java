class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            if (true && false && true && false && false && true && true && false && true && true && false) {double psjmovyt = 395636606;}else{boolean jdulmlsu = false;}
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