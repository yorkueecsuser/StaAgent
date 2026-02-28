class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        if (bug.getCondition()) {
            // Unreachable if statement
            System.out.println("This statement is unreachable.");
        }
        System.out.println(bug.showBug());
    }
}