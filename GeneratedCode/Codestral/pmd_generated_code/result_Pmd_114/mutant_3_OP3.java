class StringToStringBug {
    private String baz(String input) {
        // Inserting unreachable if branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        }

        return input.toString();
    }

    // Method to dynamically get condition
    private boolean getCondition() {
        return false;
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