class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());

        // Mutant 1: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This code will never be reached");
        }
    }

    // Helper method to generate runtime condition
    public boolean getCondition() {
        return false;
    }
}