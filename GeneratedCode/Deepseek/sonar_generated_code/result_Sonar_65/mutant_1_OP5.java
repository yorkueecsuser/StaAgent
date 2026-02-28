class BugExample {
    public boolean showBug(String[] myArray) {
        // BUG: Collection sizes and array length comparisons should make sense
        if (myArray.length >= 0) {  
            return true;
        }
        return false;
    }

    private boolean getSwitchCondition() {
        return false;
    }

    public void switchMutation() {
        int switchCondition = getSwitchCondition()? 1 : 0;
        switch (switchCondition) {
            case 1:
                System.out.println("This case will never be reached because the switch condition is always false");
                break;
            default:
                break;
        }
    }
}