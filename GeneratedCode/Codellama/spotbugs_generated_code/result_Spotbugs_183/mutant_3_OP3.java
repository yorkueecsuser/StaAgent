class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        System.out.println("count = " + count);
    }

    // Unreachable if statement added
    public static void unreachableIf() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This statement is unreachable");
        }
    }
}