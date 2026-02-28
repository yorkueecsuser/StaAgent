class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        // Mutation: Adding an unreachable for loop to a randomly selected basic block
        // This loop is unreachable as the condition is always false
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable loop.");
        }
        return false;
    }
}