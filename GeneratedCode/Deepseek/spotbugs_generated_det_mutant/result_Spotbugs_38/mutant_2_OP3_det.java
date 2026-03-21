class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
if (true && false && true && true && true && true && false && true && false && false && false) {byte chkkncff = -89;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}