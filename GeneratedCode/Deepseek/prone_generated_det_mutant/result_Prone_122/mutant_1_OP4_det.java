class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        if (false && false && false && false && false && false && false && false && false && true && false) {long xatrjliz = -198547122;}else{long ufrjomnj = 376029038;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}