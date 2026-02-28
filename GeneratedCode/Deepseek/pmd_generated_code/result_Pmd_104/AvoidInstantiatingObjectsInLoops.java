class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            Bar b = new Bar(); // Mutated: AvoidInstantiatingObjectsInLoops
        }
    }

    public static class Bar {
        public Bar() {
            // Some code
        }
    }

    public void showBug() {
        for (int i = 0; i < 10; i++) {
            Bar b = new Bar(); // Mutated: AvoidInstantiatingObjectsInLoops
        }
    }
}