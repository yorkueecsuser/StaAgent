class AnonymousClassBug {

    public interface Greeting {
        void greet();
    }

    public void demonstrateBug() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello!");
            int uxseqtcb = 0;switch  (uxseqtcb) {case 1:int iydtkyiy = -390491770;break;default:char ertfbybb = 'u';break;}
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