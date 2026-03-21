class InappropriateRegexBug {
    public String showBug(String str) {
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    }
}