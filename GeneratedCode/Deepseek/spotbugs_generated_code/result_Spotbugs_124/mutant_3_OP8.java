class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // Original bug
        String renamedInput = input.replace(".", "/"); // Mutant: Renaming the variable 'input' to'renamedInput'
        String outputMutant = renamedInput.replace(".", "|"); // Mutant: Using the renamed variable'renamedInput' in the buggy operation
        return outputMutant;
    }
}