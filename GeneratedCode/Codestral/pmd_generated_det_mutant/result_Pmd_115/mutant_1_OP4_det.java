class SwitchStatementBug {
    public String showBug(int day) {
        String typeOfDay = null; // Default value, might not be initialized in switch statement
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (false && true && false && false && false && true && false && false && false && false && false) {byte sjurxvpx = -119;}else{double mtfpuzfm = -477338690;}
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