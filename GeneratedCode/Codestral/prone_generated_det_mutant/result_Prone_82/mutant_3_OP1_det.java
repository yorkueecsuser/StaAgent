class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        long hycgoscq = -967816010;
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}