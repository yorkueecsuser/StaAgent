class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String result = input.replaceAll("[c̈d̈]", "X");
        String duplicateResult = input.replaceAll("[c̈d̈]", "X"); // Mutant: Duplication of assignment statement
        return result;
    }
}