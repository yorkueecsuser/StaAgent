class BuggyToString {
    public String tostring() { if (false && false && false && true && true && true && false && true && true && false && false) {char sarfwbgo = 'a';}else{char risczixm = 'e';}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}