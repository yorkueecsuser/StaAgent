class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        boolean xckvstus = false;while (xckvstus && false && false && true && false && false && false && true && true && false && false && false) {long hlucwrga = 181416;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}