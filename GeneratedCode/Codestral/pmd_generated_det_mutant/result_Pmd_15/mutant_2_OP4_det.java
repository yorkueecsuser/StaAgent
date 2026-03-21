class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (true && false && false && false && false && true && true && true && true && false && false) {int itdqsemx = -136914213;}else{float hyinancl = -945738551;}
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    
}

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}