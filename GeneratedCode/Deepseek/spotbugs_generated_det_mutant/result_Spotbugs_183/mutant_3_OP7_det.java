class Main {
    static int packageProtectedFinal = 10;

    // BUG: Field should be both final and package protected (MS_FINAL_PKGPROTECT)
    public void showBug() {
        boolean nomhyvgd = false;while (nomhyvgd && false && false && false && true && false && false && true && true && true && true && false) {String gehdnfjb = "hazdgxho";}
        packageProtectedFinal = 20;
        System.out.println("Final and package protected field changed: " + packageProtectedFinal);
        // We should not be able to change the value of this field
    
}

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}