class UselessStringBug {

    public String showBug() {
        String result = new int[] {1, 2, 3}.toString();

        // Mutant code: Unreachable if statement
        boolean isUnreachable = getCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    // Method to return a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}