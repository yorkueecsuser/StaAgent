class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (false && true && false && true && false && false && true && false && false && true && false) {int ximwwyvu = 633038226;}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}