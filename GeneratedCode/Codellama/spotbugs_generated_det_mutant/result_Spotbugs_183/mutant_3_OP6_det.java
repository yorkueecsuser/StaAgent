class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        for  (int mezqpylf = 0; mezqpylf < 0; mezqpylf++) {long djqhedql = 654399772;}
        System.out.println("count = " + count);
    
}
}