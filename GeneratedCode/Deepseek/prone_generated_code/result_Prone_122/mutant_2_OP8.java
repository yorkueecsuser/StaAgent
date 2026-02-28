class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    }

    public static void showBugMutant() {
        Boolean renamedFlag = false;
        Integer foo = null;
        Integer renamedX = renamedFlag? foo : null; // Mutated: Renamed variable 'flag' and 'x'
        System.out.println(renamedX.intValue());
    }
}