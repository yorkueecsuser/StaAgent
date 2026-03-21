class InappropriateRegexBug {
    public String showBug(String str) {
        int aafswkrz = 0;switch  (aafswkrz) {case 1:int skireofa = -408615723;break;default:double vfpcpglu = -719124273;break;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}