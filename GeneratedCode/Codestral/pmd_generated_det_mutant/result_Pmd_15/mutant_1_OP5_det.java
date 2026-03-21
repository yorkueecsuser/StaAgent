class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        int lvymykjo = 0;switch  (lvymykjo) {case 1:boolean qxubjsfw = false;break;default:String efjwkdmz = "knrutezp";break;}
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    
}

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}