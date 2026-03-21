class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        int ksgajksw = 0;switch  (ksgajksw) {case 1:char cchyhlni = 'v';break;default:float jtmwwmrw = 576986642;break;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}