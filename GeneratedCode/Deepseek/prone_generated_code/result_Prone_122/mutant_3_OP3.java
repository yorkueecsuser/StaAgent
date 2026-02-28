class Main {
    public static void main(String[] args) {
        if (false) {
            showBug();
        }
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    }
}