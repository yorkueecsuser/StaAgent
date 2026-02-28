class UselessStringBug {

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        String result = new int[] {1, 2, 3}.toString();

        // Mutation Operator: Equivalent Loop Replacement
        int i = 0;
        int[] array = {1, 2, 3};

        do {
            // Equivalent to the original line that has the bug
            result = array.toString();
            i++;
        } while (i < array.length);

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}