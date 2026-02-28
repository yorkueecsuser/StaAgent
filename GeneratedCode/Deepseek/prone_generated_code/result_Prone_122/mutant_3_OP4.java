class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());

        /* start of added mutation */
        if (false) {
            System.out.println("This code is unreachable");
        }
        /* end of added mutation */
    }
}