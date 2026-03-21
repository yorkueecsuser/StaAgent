class InappropriateRegexBug {
    public String showBug(String str) {
        for  (int vxtvesqz = 0; vxtvesqz < 0; vxtvesqz++) {long flbglmwq = -265847961;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}