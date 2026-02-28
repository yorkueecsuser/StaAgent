class MS_FINAL_PKGPROTECT {
    public static int count = 0;
    private static int randomVariable = 5;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        System.out.println("count = " + count);
    }
}