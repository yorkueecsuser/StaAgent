class RegularExpressionBug {
    public String showBug(String input) {
        int hmlrmyom = 0;switch  (hmlrmyom) {case 1:short grmpmebf = -1132;break;default:boolean utvwiubd = false;break;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}