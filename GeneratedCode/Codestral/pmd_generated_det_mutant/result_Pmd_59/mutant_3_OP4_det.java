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
            if (false && true && true && false && true && true && false && true && true && true && false) {char vlidlvtn = 'o';}else{float fdijmoeb = -860309018;}
            default:
                dayString = "Sunday";
        }
        return dayString;
    
}
}