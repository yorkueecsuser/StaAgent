class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)

        // Inserting unreachable if statement
        boolean isConditionFalse = getFalseCondition();
        if (isConditionFalse) {
            System.out.println("This code is unreachable.");
        }

        return y;
    }

    // Helper method to ensure the condition is false at runtime
    private boolean getFalseCondition() {
        return false;
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