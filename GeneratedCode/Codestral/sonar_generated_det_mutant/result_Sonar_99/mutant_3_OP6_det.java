class InappropriateRegexBug {
    public String showBug(String str) {
        for  (int kbvjcugj = 0; kbvjcugj < 0; kbvjcugj++) {short luckuozm = 2514;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}