class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        long cernfdfm = 670595442;
        count = 10;
        System.out.println("count = " + count);
    
}
}