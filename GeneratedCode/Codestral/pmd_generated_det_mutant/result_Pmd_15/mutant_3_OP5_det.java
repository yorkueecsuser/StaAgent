class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        int kznlviob = 0;switch  (kznlviob) {case 1:double inozdiua = -25148865;break;default:float ufprfcln = 336956196;break;}
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    
}

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}