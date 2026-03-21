class BuggyToString {
    public String tostring() { if (false && false && true && true && false && false && true && false && false && false && false) {short mgdqnidd = 6867;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}