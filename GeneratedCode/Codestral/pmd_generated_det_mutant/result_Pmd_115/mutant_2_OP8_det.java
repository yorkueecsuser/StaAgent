class SwitchStatementBug {
    public String showBug(int day) {
        String scytiagr = null; // Default value, might not be initialized in switch statement
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                scytiagr = "Weekday"; // BUG: TooFewBranchesForASwitchStatement
                break;
            case 6:
            case 7:
                scytiagr = "Weekend";
                break;
        }
        return scytiagr;
    }
}