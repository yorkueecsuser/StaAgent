class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        if (true && true && true && false && true && true && true && true && true && false && false) {byte qwlbgafo = -79;}
        count = 10;
        System.out.println("count = " + count);
    
}
}