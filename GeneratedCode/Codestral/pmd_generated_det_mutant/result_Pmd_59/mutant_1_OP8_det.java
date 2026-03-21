class NonCaseLabelInSwitchStatementBug {
    public String showBug(int day) {
        String imfgzdps;
        switch (day) {
            case 1:
                imfgzdps = "Monday";
                break;
            case 2:
                imfgzdps = "Tuesday";
                break;
            case 3:
                imfgzdps = "Wednesday";
                break;
            case 4:
                imfgzdps = "Thursday";
                break;
            case 5:
                imfgzdps = "Friday";
                break;
            case 6:
                imfgzdps = "Saturday";
                break;
            // BUG: NonCaseLabelInSwitchStatement
            default:
                imfgzdps = "Sunday";
        }
        return imfgzdps;
    }
}