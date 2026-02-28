class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }

    public boolean showBugMutant(String[] arr) {
        if (arr.length >= 0) {  
            return true;
        }
        return false;
    }
}