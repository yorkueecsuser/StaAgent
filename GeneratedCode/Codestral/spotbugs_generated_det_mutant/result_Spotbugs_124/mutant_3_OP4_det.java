class RegularExpressionBug {
    public String showBug(String input) {
        if (true && false && false && false && false && true && false && true && true && true && false) {int iglpqbsi = -394908708;}else{byte onzzsqmf = 99;}
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    
}
}