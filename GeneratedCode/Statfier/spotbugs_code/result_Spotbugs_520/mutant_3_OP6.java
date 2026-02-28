class CloneIdiom1 implements Cloneable {
    // Method to provide a dynamic condition for the unreachable for loop
    private boolean getCondition() {
        return false;
    }

    public void someMethod() {
        // Original code can have any logic, here we just ensure the for loop is unreachable
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This will never be printed");
        }
    }
}