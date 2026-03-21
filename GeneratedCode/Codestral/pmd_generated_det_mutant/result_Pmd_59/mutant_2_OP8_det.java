class NonCaseLabelInSwitchStatementBug {
    public String showBug(int day) {
        String tpfldptf;
        switch (day) {
            case 1:
                tpfldptf = "Monday";
                break;
            case 2:
                tpfldptf = "Tuesday";
                break;
            case 3:
                tpfldptf = "Wednesday";
                break;
            case 4:
                tpfldptf = "Thursday";
                break;
            case 5:
                tpfldptf = "Friday";
                break;
            case 6:
                tpfldptf = "Saturday";
                break;
            // BUG: NonCaseLabelInSwitchStatement
            default:
                tpfldptf = "Sunday";
        }
        return tpfldptf;
    }
}