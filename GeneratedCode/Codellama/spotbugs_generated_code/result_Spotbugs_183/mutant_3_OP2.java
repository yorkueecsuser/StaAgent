class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        count = 10; // Duplicated assignment statement
        System.out.println("count = " + count);
    }
}