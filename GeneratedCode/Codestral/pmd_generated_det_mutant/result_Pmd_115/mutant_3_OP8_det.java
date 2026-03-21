class SwitchStatementBug {
    public String showBug(int day) {
        String bulbwblz = null; // Default value, might not be initialized in switch statement
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                bulbwblz = "Weekday"; // BUG: TooFewBranchesForASwitchStatement
                break;
            case 6:
            case 7:
                bulbwblz = "Weekend";
                break;
        }
        return bulbwblz;
    }
}