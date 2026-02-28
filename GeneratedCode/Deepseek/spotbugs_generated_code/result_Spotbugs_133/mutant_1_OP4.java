class UselessStringBug {

    // Added method to return a dynamically determined false condition
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        // Original bug: Invocation of toString on an unnamed array
        String result = new int[] {1, 2, 3}.toString();

        // Added unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This code should never execute.");
        } else {
            // This else block is unreachable but added for code correctness
            System.out.println("This code is unreachable but added for correctness.");
        }

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}