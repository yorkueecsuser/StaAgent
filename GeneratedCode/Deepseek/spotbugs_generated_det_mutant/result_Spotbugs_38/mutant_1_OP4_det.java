class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
if (true && false && true && false && true && false && true && false && true && true && false) {long qvvpelsj = -416166213;}else{float wtyrhfjq = 538214248;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}