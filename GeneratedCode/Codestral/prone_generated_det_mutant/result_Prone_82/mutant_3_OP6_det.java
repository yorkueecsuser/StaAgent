class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        for  (int jopmezni = 0; jopmezni < 0; jopmezni++) {double xudfcscr = -72570162;}
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}