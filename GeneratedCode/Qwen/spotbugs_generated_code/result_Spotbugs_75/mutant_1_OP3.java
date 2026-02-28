class EqualsNullBug {

    public boolean showBug(String input) {
        // BUG: EC: Call to equals(null) (EC_NULL_ARG) 
        return input.equals(null);

        // Unreachable if statement inserted
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}