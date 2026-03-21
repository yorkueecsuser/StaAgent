class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        int mfsfkgjl = 0;switch  (mfsfkgjl) {case 1:String zosoamgb = "hrzlkjmm";break;default:long feqrjnuu = 92388194;break;}
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    
}

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}