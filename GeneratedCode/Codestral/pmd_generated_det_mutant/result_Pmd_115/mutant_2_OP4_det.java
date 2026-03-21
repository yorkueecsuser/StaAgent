class SwitchStatementBug {
    public String showBug(int day) {
        String typeOfDay = null; // Default value, might not be initialized in switch statement
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (true && true && false && false && true && true && true && true && false && false && false) {float ghfholbq = -674585168;}else{int zbvsuehh = 651229071;}
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