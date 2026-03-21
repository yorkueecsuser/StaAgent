class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        for  (int vxjrkzpg = 0; vxjrkzpg < 0; vxjrkzpg++) {boolean odkzfffe = true;}
        System.out.println("count = " + count);
    
}
}