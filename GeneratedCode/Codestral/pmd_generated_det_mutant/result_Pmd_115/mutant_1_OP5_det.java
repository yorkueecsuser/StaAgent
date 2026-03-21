class SwitchStatementBug {
    public String showBug(int day) {
        String typeOfDay = null; // Default value, might not be initialized in switch statement
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int ipkvgbvs = 0;switch  (ipkvgbvs) {case 1:short xaaentzd = 9062;break;default:boolean ccyxtlmr = true;break;}
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