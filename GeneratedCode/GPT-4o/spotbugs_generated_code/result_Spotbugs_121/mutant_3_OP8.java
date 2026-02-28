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

// Mutated code with Renaming operator applied
class ImpossibleDowncastExampleMutant {

    public static void main(String[] args) {
        try {
            new ImpossibleDowncastExampleMutant().showBugMutant();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public String showBugMutant() {
        Object x = Integer.valueOf(42);
        String y = (String) x; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return y;
    }
}