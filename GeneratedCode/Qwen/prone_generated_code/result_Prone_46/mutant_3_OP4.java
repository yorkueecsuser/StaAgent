class EqualsNullBug {

    public boolean showBug(String x) {
        // BUG: EqualsNull
        return x.equals(null);

        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This is an unreachable if block.");
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        System.out.println(example.showBug("Hello")); // This will return false
    }
}