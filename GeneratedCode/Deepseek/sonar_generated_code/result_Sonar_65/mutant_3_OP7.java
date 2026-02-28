class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }

        // MUTANT: Unreachable while loop mutant
        boolean conditionWhile = false;
        while (conditionWhile) {
            conditionWhile = true;
        }

        return false;
    }
}