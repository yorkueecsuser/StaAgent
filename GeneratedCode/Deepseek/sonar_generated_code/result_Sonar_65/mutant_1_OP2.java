class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        if (myArray.length >= 0) {  // Mutant Code
            return true;
        }
        return false;
    }
}