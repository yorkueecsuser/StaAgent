class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable statement in showBug");
        }
        return answer1;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable statement in showBug2");
        }
        return answer2;
    }

    private boolean getCondition() {
        // This method always returns false, making the if condition effectively unreachable
        return false;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }
}