class StringToStringBug {
    private String baz(String input) {
        // BUG: StringToString
        // Original code
        return input.toString();

        // Mutant code
        String renamedInput = input;
        return renamedInput.toString();
    }

    public String showBug(String input) {
        // Original code
        return baz(input);

        // Mutant code
        String renamedInput = input;
        return baz(renamedInput);
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();

        // Original code
        String result = bug.showBug("howdy");

        // Mutant code
        String renamedResult = bug.showBug("howdy");

        System.out.println(result);
    }
}