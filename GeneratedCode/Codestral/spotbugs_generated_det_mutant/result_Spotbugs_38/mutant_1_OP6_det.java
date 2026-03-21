class BuggyToString {
    public String tostring() { for  (int ppylwccq = 0; ppylwccq < 0; ppylwccq++) {long qdakdjqe = -969920922;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}