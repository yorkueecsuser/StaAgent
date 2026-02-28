class StringToStringBug {
    private String baz(String input) {
        // BUG: StringToString
        String result = input.toString();
        // Mutant: Duplication
        String duplicateResult = result;
        return result;
    }

    public String showBug(String input) {
        return baz(input);
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();
        String result = bug.showBug("howdy");
        System.out.println(result);
    }
}