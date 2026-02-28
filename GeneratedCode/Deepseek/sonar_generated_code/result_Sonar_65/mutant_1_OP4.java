class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        } else {
            // This is the mutant code that makes the if-else branch unreachable
            return false;
        }
        return false;
    }
}