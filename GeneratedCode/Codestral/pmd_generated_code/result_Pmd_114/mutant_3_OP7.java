class StringToStringBug {
    private String baz(String input) {
        // BUG: StringToString
        // Mutant code: Unreachable while loop
        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This is an unreachable block");
        }
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