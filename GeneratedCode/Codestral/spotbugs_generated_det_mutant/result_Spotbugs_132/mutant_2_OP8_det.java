class UselessStringBug {
    public String showBug() {
        int[] bqngjnpl = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an bqngjnpl (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return bqngjnpl.toString();
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}