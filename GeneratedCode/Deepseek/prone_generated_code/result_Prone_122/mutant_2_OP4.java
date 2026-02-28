class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());

        // Adding a unique unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the only reachable branch.");
        }
    }

    // A method to get a runtime condition
    private static boolean getCondition() {
        return false;
    }
}