class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (false && false && false && false && false && false && false && true && true && false && false) {double uqbuytli = 711261853;}else{long axvwbnms = -559577099;}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}