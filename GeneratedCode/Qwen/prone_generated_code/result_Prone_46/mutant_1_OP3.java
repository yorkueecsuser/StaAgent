class EqualsNullBug {

    public boolean showBug(String x) {
        // BUG: EqualsNull
        return x.equals(null);
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        System.out.println(example.showBug("Hello")); // This will return false

        // Unreachable if statement mutant
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private static boolean getCondition() {
        return false; // This method returns false, making the if statement effectively unreachable
    }
}