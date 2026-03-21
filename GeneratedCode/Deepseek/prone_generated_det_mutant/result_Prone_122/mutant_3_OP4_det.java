class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        if (true && true && false && true && false && false && true && false && false && true && false) {short oajiucrp = -5157;}else{double laspqtvn = 369058870;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}