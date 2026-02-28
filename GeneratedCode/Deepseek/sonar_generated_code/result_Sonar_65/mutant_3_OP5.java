class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        boolean condition = false;
        if (condition) {
            return true;
        }
        return false;
    }
}