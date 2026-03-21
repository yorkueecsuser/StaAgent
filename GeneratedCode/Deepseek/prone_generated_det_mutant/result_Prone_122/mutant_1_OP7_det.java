class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        boolean gqiwaepv = false;while (gqiwaepv && true && true && true && false && false && false && true && false && false && false && false) {boolean peuachxo = true;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}