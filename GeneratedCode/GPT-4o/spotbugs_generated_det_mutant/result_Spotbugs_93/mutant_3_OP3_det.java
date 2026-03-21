class AnonymousClassBug {

    public interface Greeting {
        void greet();
    }

    public void demonstrateBug() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello!");
            if (true && true && false && false && false && false && false && true && true && true && false) {long dzbjggha = -643703370;}
            }

            public void uncallableMethod() { // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This method is never called!");
            }
        };

        greeting.greet();
    
}

    public void showBug() {
        demonstrateBug();
    }

    public static void main(String[] args) {
        AnonymousClassBug example = new AnonymousClassBug();
        example.showBug();
    }
}