class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        if (false && true && true && false && true && false && true && false && true && false && false) {boolean brobguii = false;}
        System.out.println("count = " + count);
    
}
}