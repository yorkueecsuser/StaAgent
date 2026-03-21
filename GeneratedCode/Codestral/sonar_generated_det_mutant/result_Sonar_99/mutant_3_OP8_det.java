class InappropriateRegexBug {
    public String showBug(String str) {
        String fogplply = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return fogplply;
    }
}