class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            Bar f = new Bar(); // Mutant: Renaming
        }
    }

    public static class Bar { // Mutant: Renaming
        public Bar() {
            // Some code
        }
    }

    public void showBug() {
        for (int i = 0; i < 10; i++) {
            Bar f = new Bar(); // Mutant: Renaming
        }
    }
}