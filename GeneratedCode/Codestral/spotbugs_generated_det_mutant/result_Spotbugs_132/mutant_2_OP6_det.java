class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        for  (int pvmfdjjp = 0; pvmfdjjp < 0; pvmfdjjp++) {byte meohjdea = 114;}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}