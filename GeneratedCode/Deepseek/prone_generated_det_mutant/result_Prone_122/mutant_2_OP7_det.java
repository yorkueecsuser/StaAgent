class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        boolean ufcggduw = false;while (ufcggduw && false && false && true && false && false && false && false && true && false && true && false) {int vvbgpdir = 432536091;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}