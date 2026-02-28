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

// Mutation: Renaming
class ImpossibleDowncastExampleMutant {

    public static void main(String[] b) {
        try {
            new ImpossibleDowncastExampleMutant().showBug();
        } catch (ClassCastException c) {
            System.out.println("Caught exception: " + c);
        }
    }

    public String showBug() {
        Object n = Integer.valueOf(42);
        String r = (String) n; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return r;
    }
}