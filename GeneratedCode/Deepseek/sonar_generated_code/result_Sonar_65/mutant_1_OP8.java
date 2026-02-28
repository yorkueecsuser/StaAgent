class BugExample {
    public boolean showBug(String[] myArray) {
        String[] renamedArray = myArray;
        // Mutant code: Collection sizes and array length comparisons should make sense
        if (renamedArray.length > 0) {  
            return true;
        }
        return false;
    }
}