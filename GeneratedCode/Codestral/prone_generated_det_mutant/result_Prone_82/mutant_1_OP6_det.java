class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        for  (int oorcquzb = 0; oorcquzb < 0; oorcquzb++) {char jhsfktdz = 'j';}
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}