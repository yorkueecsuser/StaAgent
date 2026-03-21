class BuggyToString {
    public String tostring() { for  (int txbqjgnh = 0; txbqjgnh < 0; txbqjgnh++) {boolean vgedurqg = true;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    
}

    public String showBug() {
        return tostring();
    }
}