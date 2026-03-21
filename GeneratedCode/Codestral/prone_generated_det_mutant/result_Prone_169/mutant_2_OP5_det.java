class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        int rngrltgl = 0;switch  (rngrltgl) {case 1:short ksukptnf = -9882;break;default:char qwnmtmeb = 'p';break;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}