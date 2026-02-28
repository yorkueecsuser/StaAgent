class BuggyStringBuffer {
    public int showBug() {
        // Original code
        StringBuffer sb = new StringBuffer('c');

        // Mutated code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop will never execute as the condition is always false");
        }

        return sb.capacity();
    }

    // Dummy method to return false. In a real-world scenario, this could be a non-constant value.
    private boolean getCondition() {
        return false;
    }
}