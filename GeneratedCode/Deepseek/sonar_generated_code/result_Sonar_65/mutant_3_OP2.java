class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        // Duplication of the above if block
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }
}