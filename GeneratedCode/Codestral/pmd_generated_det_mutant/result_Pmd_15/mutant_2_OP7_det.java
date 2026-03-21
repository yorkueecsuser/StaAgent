class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        boolean exkazgse = false;while (exkazgse && true && true && false && false && true && false && true && false && true && false && false) {String gdsamork = "ufqkcubc";}
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    
}

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}