class BuggyToString {
    public String tostring() { if (false && true && false && true && false && true && true && true && false && true && false) {boolean pjhklgon = true;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}