class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        // Inserted unreachable for loop mutation
        boolean conditionFor = getCondition(); // Dynamically determined condition to avoid compile-time error
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable.");
        }
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return y;
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
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