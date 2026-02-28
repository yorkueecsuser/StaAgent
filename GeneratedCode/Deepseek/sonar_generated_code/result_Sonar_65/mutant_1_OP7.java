class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        
        // Added mutation code for Unreachable while loop
        boolean condition = true;
        while (condition) {
            // Infinite loop
        }

        return false;
    }
}