class SelfEqualsBug {

    public boolean showBug() {
        String str = "example";
        return str.equals(str); // BUG: SelfEquals

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable block");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is another unreachable block");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}