class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());

        // Mutant code: Insert an unreachable while loop with a false condition
        boolean mutantCondition = false;
        while (mutantCondition) {
            System.out.println("This statement is unreachable.");
        }
    }
}