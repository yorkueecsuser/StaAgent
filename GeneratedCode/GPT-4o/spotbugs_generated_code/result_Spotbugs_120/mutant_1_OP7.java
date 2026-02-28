class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This should never be printed.");
        }
        return y;
    }

    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}