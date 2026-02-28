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

    // Renaming variable 'count' to 'total'
    public static void showBug_mutant_1() {
        total = 10;
        System.out.println("count = " + total);
    }
}