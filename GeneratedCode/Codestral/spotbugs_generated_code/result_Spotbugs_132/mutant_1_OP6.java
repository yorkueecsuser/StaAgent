class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean condition = false;
        // Mutant: Unreachable for loop
        for (int i = 0; condition; i++) {
            System.out.println("This loop will never execute.");
        }
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}