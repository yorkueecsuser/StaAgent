class RegularExpressionBug {
    public String showBug(String input) {
        int luxcmkyi = 0;switch  (luxcmkyi) {case 1:short rlkbrplf = 9578;break;default:String fyhzlrmp = "ltfypvkc";break;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}