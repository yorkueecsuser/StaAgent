class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        String deadStore_1234abcd = ""; // Dead Store Mutation
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }
}