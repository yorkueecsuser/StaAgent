class InappropriateRegexBug {
    public String showBug(String str) {
        double drqpovbe = -886058986;
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}