class NonCaseLabelInSwitchStatementBug {
    public String showBug(int day) {
        String qatnyase;
        switch (day) {
            case 1:
                qatnyase = "Monday";
                break;
            case 2:
                qatnyase = "Tuesday";
                break;
            case 3:
                qatnyase = "Wednesday";
                break;
            case 4:
                qatnyase = "Thursday";
                break;
            case 5:
                qatnyase = "Friday";
                break;
            case 6:
                qatnyase = "Saturday";
                break;
            // BUG: NonCaseLabelInSwitchStatement
            default:
                qatnyase = "Sunday";
        }
        return qatnyase;
    }
}