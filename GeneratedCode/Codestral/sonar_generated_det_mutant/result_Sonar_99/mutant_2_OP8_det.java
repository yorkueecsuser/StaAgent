class InappropriateRegexBug {
    public String showBug(String str) {
        String xgeqvsuq = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return xgeqvsuq;
    }
}