class Main {
    public static void main(String[] args) {
        showBug();
        unreachableMutant();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    }

    public static void unreachableMutant() {
        boolean condition = getCondition();
        while (condition) {
            // unreachable mutant code
            System.out.println("Unreachable mutant code");
        }
    }

    public static boolean getCondition() {
        return false; // this makes the while loop unreachable
    }
}