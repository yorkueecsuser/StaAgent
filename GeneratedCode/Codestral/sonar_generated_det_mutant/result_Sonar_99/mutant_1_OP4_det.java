class InappropriateRegexBug {
    public String showBug(String str) {
        if (true && true && true && false && false && true && true && true && true && true && false) {float jflipvyj = -169812033;}else{float leexwvvb = -511360596;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}