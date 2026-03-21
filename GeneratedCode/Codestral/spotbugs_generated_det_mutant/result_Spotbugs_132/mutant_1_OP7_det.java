class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean vhvyunrf = false;while (vhvyunrf && true && false && true && true && false && false && true && false && false && false && false) {char qehtxwuh = 'f';}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}