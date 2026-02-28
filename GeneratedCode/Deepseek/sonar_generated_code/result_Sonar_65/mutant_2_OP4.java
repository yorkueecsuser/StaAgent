class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        // Mutant Code: Unreachable if-else statement
        else {
            boolean unreachable = false;
            if (unreachable) {
                // Code unreachable by design
                return false;
            }
        }
        return false;
    }
}