class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // Original line
        String duplicateOutput = input.replace(".", "|"); // Mutated line: Duplication of the original operation
        return output;
    }
}