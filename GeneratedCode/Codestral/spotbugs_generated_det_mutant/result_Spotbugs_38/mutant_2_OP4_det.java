class BuggyToString {
    public String tostring() { if (false && false && false && true && false && false && false && false && false && true && false) {char nhprqcyr = 'j';}else{float vrgljuii = -446483421;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}