class NonCaseLabelInSwitchStatementBug {
    public String showBug(int day) {
        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            // BUG: NonCaseLabelInSwitchStatement
            int zhcgzhzz = 0;switch  (zhcgzhzz) {case 1:float cvxnwpat = -984600821;break;default:float fzeqfupq = 210585776;break;}
            default:
                dayString = "Sunday";
        }
        return dayString;
    
}
}