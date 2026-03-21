class InappropriateRegexBug {
    public String showBug(String str) {
        int tkljhocx = 0;switch  (tkljhocx) {case 1:int jiojtgcd = 493109464;break;default:char mdbtwlus = 's';break;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}