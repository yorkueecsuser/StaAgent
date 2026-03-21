class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        for  (int bzhuhidy = 0; bzhuhidy < 0; bzhuhidy++) {byte hexrpprm = -75;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}