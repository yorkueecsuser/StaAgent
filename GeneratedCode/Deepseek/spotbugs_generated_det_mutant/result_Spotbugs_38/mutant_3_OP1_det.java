class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
double sauxstye = -696739264;

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}