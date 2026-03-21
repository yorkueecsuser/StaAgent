class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
if (false && true && true && false && true && true && true && true && true && false && false) {double sgjwbqep = -681801006;}else{float lhokyxkh = 411193285;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}