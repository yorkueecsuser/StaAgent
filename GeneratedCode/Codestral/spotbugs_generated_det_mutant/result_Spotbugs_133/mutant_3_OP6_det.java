class UselessStringBug {

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        for  (int nppzzats = 0; nppzzats < 0; nppzzats++) {byte ccuynndj = -86;}
        String result = new int[] {1, 2, 3}.toString();
        return result;
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}