class BuggyClass {
    // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public String tostring() {
if (true && false && false && false && false && false && false && false && true && false && false) {boolean srfbyxka = true;}

        return "This is a bug";
    
}

    public void showBug() {
        System.out.println(tostring());
    }
}