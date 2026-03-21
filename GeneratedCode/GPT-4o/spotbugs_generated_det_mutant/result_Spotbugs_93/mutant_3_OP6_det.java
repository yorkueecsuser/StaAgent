class AnonymousClassBug {

    public interface Greeting {
        void greet();
    }

    public void demonstrateBug() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello!");
            for  (int bnfkxohh = 0; bnfkxohh < 0; bnfkxohh++) {byte cmuuvryk = 34;}
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