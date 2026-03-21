class UselessStringBug {
    public String showBug() {
        int[] ptsxqiqt = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an ptsxqiqt (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return ptsxqiqt.toString();
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}