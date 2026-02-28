class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        String unused = "unused"; // Dead Store Mutation Operator
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }
}