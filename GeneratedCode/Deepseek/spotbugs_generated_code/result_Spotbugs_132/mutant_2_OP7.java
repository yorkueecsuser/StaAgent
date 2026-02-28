class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        String result = array.toString();

        // MUTATED CODE: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute because conditionWhile is always false
            System.out.println("This is an unreachable while loop");
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