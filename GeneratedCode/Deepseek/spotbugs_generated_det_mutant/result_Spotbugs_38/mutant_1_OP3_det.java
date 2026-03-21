class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
if (true && true && true && true && false && false && true && true && false && true && false) {float rlfshmzx = -880163001;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}