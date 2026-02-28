class AvoidInstantiatingObjectsInLoops {
    public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            switch(f.hashCode()) {} // Mutant: UnreachableSwitchStatementMutation
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
            int x = 0; // Mutant: UnreachableSwitchStatementMutation
            switch(x) {} // Mutant: UnreachableSwitchStatementMutation
        }
    }
}