class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean wczyncwh = false;while (wczyncwh && true && true && false && true && true && false && true && false && false && false && false) {char njkvofks = 'l';}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}