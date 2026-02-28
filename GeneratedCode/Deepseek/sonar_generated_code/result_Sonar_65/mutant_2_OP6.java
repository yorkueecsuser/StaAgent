class BugExample {
    public boolean showBug(String[] myArray) {
        boolean alwaysFalse = false;
        for(int i = 0; alwaysFalse; i++) {
            // Unreachable loop
        }
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }
}