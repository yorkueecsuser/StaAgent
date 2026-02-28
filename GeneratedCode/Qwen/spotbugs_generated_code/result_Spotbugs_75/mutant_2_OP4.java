class EqualsNullBug {

    public boolean showBug(String input) {
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);

        // Mutated Code: Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code due to the condition.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}