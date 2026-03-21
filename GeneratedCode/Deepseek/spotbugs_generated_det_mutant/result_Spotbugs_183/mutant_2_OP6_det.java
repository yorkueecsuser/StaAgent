class Main {
    static int packageProtectedFinal = 10;

    // BUG: Field should be both final and package protected (MS_FINAL_PKGPROTECT)
    public void showBug() {
        for  (int jykehvdw = 0; jykehvdw < 0; jykehvdw++) {long oxducrwu = -801512152;}
        packageProtectedFinal = 20;
        System.out.println("Final and package protected field changed: " + packageProtectedFinal);
        // We should not be able to change the value of this field
    
}

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }
}