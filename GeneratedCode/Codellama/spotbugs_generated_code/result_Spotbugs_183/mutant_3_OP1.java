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
    public static void deadStore(int i) {
        int x = 10;
        System.out.println("x = " + x);
    }
}