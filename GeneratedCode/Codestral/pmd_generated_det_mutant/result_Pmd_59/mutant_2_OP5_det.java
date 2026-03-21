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
            int nctnnlxi = 0;switch  (nctnnlxi) {case 1:byte nmuypdsv = -5;break;default:byte yslunesd = 97;break;}
            default:
                dayString = "Sunday";
        }
        return dayString;
    
}
}