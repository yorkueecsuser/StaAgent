class Main {
    static int packageProtectedFinal = 10;

    // BUG: Field should be both final and package protected (MS_FINAL_PKGPROTECT)
    public void showBug() {
        boolean rgiblzbr = false;while (rgiblzbr && false && false && false && false && false && false && false && true && true && true && false) {short ltdltbtt = 2770;}
        packageProtectedFinal = 20;
        System.out.println("Final and package protected field changed: " + packageProtectedFinal);
        // We should not be able to change the value of this field
    
}

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}