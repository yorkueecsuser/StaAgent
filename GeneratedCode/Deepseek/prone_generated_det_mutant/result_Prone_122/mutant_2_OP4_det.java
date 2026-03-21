class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        if (false && false && true && true && true && true && false && true && false && false && false) {int ahmapeex = -653466089;}else{byte pcrpself = 40;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}