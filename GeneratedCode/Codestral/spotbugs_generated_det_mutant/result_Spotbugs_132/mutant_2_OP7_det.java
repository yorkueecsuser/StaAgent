class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean dhoimtts = false;while (dhoimtts && true && true && false && false && false && true && false && false && true && true && false) {double ccaluwtf = -499152319;}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}