class BuggyToString {
    public String tostring() { for  (int dmbazguz = 0; dmbazguz < 0; dmbazguz++) {boolean mlixmkfm = true;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}