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
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return result;
    }

    private boolean getFalseCondition() {
        return false;
    }
}