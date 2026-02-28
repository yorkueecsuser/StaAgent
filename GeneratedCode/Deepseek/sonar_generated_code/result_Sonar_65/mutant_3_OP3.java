class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        boolean condition = true;
        if (condition) {
            if (myArray.length >= 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}