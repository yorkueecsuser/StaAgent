class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer a = flag? foo : null; // Mutant: Renaming of variable 'foo' to 'a'
        System.out.println(a.intValue());
    }
}