class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        boolean condition = getCondition();
        if (myArray.length >= 0) {  
            return true;
        }
        while (condition) {
            // Insert unreachable code here
        }
        return false;
    }

    private boolean getCondition() {
        return false;
    }
}