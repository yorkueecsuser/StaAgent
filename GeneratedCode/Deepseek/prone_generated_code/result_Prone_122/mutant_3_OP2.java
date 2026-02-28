class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
        Integer y = flag? foo : null; // Mutant: Duplication
        System.out.println(y.intValue());
    }
}