class StringToStringBug {
    private String baz(String input) {
        // BUG: StringToString
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable for loop
            System.out.println("This line should not be executed");
        }
        return input.toString();
    }

    public String showBug(String input) {
        return baz(input);
    }

    private boolean getCondition() {
        // Replace this with your logic to determine the condition dynamically
        return false;
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();
        String result = bug.showBug("howdy");
        System.out.println(result);
    }
}