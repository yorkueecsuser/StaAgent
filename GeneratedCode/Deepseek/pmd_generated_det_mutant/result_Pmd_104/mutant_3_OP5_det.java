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
            int kgwczvkj = 0;switch  (kgwczvkj) {case 1:double nrnwivkd = 344956322;break;default:double ygsjdlxl = 854828520;break;}
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    
}
}