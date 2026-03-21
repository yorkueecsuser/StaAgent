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
            int pavaexie = 0;switch  (pavaexie) {case 1:int itwjrhoz = -169861060;break;default:float ftrqbniz = 125396823;break;}
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
        }
    
}
}