class InappropriateRegexBug {
    public String showBug(String str) {
        short bvokllqj = 3063;
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}