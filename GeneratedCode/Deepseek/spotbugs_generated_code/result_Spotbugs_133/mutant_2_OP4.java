class UselessStringBug {

    private boolean getCondition() {
        return false; // This method always returns false to ensure the if-else branch is unreachable
    }

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        String result = new int[] {1, 2, 3}.toString();

        // Mutation: Unreachable if-else statement
        if (getCondition()) {
            // This code is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block of code");
        } else {
            // This else block is also unreachable
            int infiniteLoop = 0;
            while (true) {
                infiniteLoop++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}