class UselessStringBug {

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        String result = new int[] {1, 2, 3}.toString();

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed because conditionWhile is always false
            System.out.println("Unreachable code");
        }

        return result;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}