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

    // Unreachable if-else statement mutant
    public static void showBugMutant() {
        boolean shouldRun = false;
        if (shouldRun) {
            count = 10;
            System.out.println("count = " + count);
        } else {
            count = 20;
            System.out.println("count = " + count);
        }
    }
}