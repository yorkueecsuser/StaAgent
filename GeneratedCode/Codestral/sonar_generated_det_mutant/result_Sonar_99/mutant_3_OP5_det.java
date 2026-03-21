class InappropriateRegexBug {
    public String showBug(String str) {
        int mwxqacfm = 0;switch  (mwxqacfm) {case 1:char txmqrfra = 'v';break;default:int gkfwhdxs = 210229732;break;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}