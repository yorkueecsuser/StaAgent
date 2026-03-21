class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        String arrayString = array.toString();

        // Mutation: Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            return "This branch is unreachable.";
        } else {
            return arrayString;
        }
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}