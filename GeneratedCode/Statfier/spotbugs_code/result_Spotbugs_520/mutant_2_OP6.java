class CloneIdiom1 implements Cloneable {
    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public void someMethod() {
        // Original code can have additional methods or logic
        // For demonstration, adding a method that contains the mutant

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This will never be printed.");
        }
    }
}