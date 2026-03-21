class UselessStringBug {
    public String showBug() {
        int[] bxdkizmo = {1, 2, 3, 4, 5};
        // BUG: USELESS_STRING: Invocation of toString on an bxdkizmo (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return bxdkizmo.toString();
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}