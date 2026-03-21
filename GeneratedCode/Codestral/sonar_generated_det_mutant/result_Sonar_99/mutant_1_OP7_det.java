class InappropriateRegexBug {
    public String showBug(String str) {
        boolean euamfqlq = false;while (euamfqlq && true && true && true && false && false && false && false && false && false && false && false) {long uqnxacyo = 241789907;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}