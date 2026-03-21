class RegularExpressionBug {
    public String showBug(String input) {
        if (false && true && false && false && false && false && false && true && false && false && false) {short vkxpudol = -4370;}else{long tgvwqdlh = 389524011;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}