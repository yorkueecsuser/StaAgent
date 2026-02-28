class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = foo!= null? flag? foo : null : null; // Mutant: Duplication
        System.out.println(x.intValue());
    }
}