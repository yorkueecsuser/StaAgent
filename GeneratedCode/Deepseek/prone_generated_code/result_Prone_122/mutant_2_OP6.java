class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
        // unreachable for loop mutation
        for(boolean condition = false; condition; ){
            System.out.println("This loop is unreachable");
        }
    }
}