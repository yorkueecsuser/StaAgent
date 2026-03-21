class InappropriateRegexBug {
    public String showBug(String str) {
        String gxgiuxnz = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return gxgiuxnz;
    }
}