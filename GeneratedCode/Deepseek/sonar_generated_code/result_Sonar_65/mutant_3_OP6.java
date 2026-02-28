class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        boolean condition = true;
        if (condition) {  
            // Unreachable code
            for(; false;){
              // Do something
            }
            return true;
        }
        return false;
    }
}