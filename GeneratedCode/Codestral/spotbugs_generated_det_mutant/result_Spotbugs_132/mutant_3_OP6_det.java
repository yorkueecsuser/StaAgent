class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        for  (int tdogilfg = 0; tdogilfg < 0; tdogilfg++) {float qtgnhdfv = -834705758;}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}