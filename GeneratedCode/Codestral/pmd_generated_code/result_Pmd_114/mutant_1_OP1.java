class StringToStringBug {
    private String baz(String input) {
        // BUG: StringToString
        // Dead store mutant
        String deadStore = "unusedVar";
        return input.toString();
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