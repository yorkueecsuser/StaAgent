class SwitchStatementBug {
    public String showBug(int day) {
        String typeOfDay = null; // Default value, might not be initialized in switch statement
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int dvohtllr = 0;switch  (dvohtllr) {case 1:byte leqslgqs = 122;break;default:short hjkbwlcc = 4240;break;}
                typeOfDay = "Weekday"; // BUG: TooFewBranchesForASwitchStatement
                break;
            case 6:
            case 7:
                typeOfDay = "Weekend";
                break;
        }
        return typeOfDay;
    
}
}