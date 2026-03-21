class BuggyToString {
    public String tostring() { if (false && false && false && true && true && false && true && true && true && false && false) {short nfntjqfc = -1607;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}