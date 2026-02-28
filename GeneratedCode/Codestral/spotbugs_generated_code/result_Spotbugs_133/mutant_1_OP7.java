class UselessStringBug {

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        String result = new int[] {1, 2, 3}.toString();

        // Mutant code: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}