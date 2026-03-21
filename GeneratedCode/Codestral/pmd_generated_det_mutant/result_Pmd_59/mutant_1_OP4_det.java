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
            if (true && true && false && false && false && true && false && false && true && true && false) {short uednzsih = -6564;}else{long srvfntiu = -668452763;}
            default:
                dayString = "Sunday";
        }
        return dayString;
    
}
}