class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }
    
    public boolean showMutant(String[] myArray) {
        boolean mutantCondition = myArray.length < 0;
        if (mutantCondition) {
            switch(myArray.length) {
                case -1:
                    break;
                default:
                    break;
            }
        }
        return false;
    }
}