class UselessStringBug {

    public String showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if statement
            if (false) {
                System.out.println("This will never execute");
            }
        }

        String result = new int[] {1, 2, 3}.toString();
        return result;
    }

    private boolean getCondition() {
        // This is a placeholder method. Replace it with a method that dynamically determines the condition.
        return true;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}