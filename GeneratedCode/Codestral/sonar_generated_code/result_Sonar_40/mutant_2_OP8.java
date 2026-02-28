class UnicodeGraphemeClustersBug {
    public String showBug(String input) {
        String replacedInput = input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return replacedInput;
    }

    public String showMutant(String replacedInput) { // Mutant code: Renaming the variable 'input' to'replacedInput'
        String mutantResult = replacedInput.replaceAll("[c̈d̈]", "Y");
        return mutantResult;
    }
}