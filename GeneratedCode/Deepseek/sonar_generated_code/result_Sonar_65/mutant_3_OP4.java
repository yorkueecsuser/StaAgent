class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        else {
            // Unreachable if-else statement mutation
            if (false) {
                System.out.println("Unreachable statement");
            }
            return false;
        }
        return false;  // Non-reachable statement to avoid unreachable statement error
    }
}