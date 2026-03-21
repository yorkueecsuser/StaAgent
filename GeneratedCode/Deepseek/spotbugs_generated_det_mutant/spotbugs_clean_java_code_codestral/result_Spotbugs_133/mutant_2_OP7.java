class UselessStringBug {

    public boolean getCondition() {
        return false; // Added for the unreachable while loop
    }

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array
        String result = new int[] {1, 2, 3}.toString();

        // Mutation Operator: Unreachable while loop
        while (getCondition()) {
            System.out.println("This line will never be executed because getCondition() always returns false.");
        }

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}