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
            boolean otqgfaal = false;while (otqgfaal && false && true && true && true && false && false && true && false && false && true && false) {int tgoqfcnp = 180442549;}
            default:
                dayString = "Sunday";
        }
        return dayString;
    
}
}