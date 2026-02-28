class UselessStringBug {

    public String showBug() {
        String result = new int[] {1, 2, 3}.toString();

        // Mutation: Unreachable if-else statement
        if (getCondition()) {
            // This branch is unreachable, as getCondition() always returns false
            System.out.println("Unreachable branch");
        } else {
            // This is a reachable branch
            System.out.println("Reachable branch");
        }

        return result;
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}