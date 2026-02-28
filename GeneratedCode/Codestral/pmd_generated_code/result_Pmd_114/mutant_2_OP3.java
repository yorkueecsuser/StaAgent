class StringToStringBug {
    private boolean getCondition() {
        return false;
    }

    private String baz(String input) {
        // BUG: StringToString
        if (getCondition()) {
            // Unreachable if statement
            throw new RuntimeException("Unreachable code executed");
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