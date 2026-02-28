class ImpossibleDowncastExample {

    public static void main(String[] args) {
        try {
            new ImpossibleDowncastExample().showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public String showBug() {
        Object integerObject = Integer.valueOf(42);
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return result;
    }
}

// Mutated Code
class MutatedImpossibleDowncastExample {

    public static void main(String[] args) {
        try {
            new MutatedImpossibleDowncastExample().s();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public String s() {
        Object a = Integer.valueOf(42);
        String r = (String) a; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return r;
    }
}