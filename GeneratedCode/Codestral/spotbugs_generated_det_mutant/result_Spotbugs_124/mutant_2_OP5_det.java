class RegularExpressionBug {
    public String showBug(String input) {
        int ytwqlcva = 0;switch  (ytwqlcva) {case 1:byte kliqhshf = 19;break;default:double scacynmd = -224607412;break;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}