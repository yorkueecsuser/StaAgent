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

    // Unreachable if statement mutant
    public static void showBugMutant() {
        count = 10;
        if (false) {
            System.out.println("This statement is unreachable.");
        }
        System.out.println("count = " + count);
    }
}