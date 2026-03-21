class InappropriateRegexBug {
    public String showBug(String str) {
        double avfoczta = 382693551;
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}