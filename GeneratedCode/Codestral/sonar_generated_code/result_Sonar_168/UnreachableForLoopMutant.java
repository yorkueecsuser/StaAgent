class UnreachableForLoopMutant {
    public void unreachableForLoopExample(boolean condition) {
        if (condition) {
            System.out.println("Condition is true");
        } else {
            // Inserting unreachable for loop based on the mutation operator
            // The condition of the loop is always false to make it unreachable
            for (int i = 0; false; i++) {
                System.out.println("Unreachable loop iteration: " + i);
            }
        }
    }
}