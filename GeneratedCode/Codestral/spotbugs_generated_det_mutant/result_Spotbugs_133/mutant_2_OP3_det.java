class UselessStringBug {

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        if (true && false && false && false && true && false && false && false && false && true && false) {long higjvpgd = -231771087;}
        String result = new int[] {1, 2, 3}.toString();
        return result;
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}