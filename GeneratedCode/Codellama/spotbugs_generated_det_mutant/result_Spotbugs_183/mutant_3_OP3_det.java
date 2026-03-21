class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        if (false && true && false && true && true && false && false && true && false && true && false) {char hvcroetg = 'c';}
        System.out.println("count = " + count);
    
}
}