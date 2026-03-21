class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
short cezjunft = -2999;

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}