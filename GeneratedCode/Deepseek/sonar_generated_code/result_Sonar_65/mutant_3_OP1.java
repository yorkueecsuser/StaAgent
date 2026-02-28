class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        boolean result;
        if (myArray.length >= 0) {  
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}