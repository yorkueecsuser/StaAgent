class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        boolean zxjhxbsc = true;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}