class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }

    // Mutated code
    public boolean showMutantBug(String[] a) {
        if (a.length >= 0) {
            return true;
        }
        return false;
    }
}