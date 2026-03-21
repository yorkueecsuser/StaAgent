class BuggyToString {
    public String tostring() { if (true && true && true && false && true && true && true && true && true && false && false) {String pupqjrbp = "lkqkaovk";}else{boolean ayoqsahu = true;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}