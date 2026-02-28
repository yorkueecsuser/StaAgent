class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        // Inserting an unreachable if statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This will never be printed.");
        }
        
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return y;
    }

    // Method to simulate a false condition, ensuring runtime evaluation
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