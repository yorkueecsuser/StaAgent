class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolelodnokbyn lodnokby = true;
        boolelodnokbyn lvjixrhl = lodnokby && lodnokby; // BUG: IdentityBinlodnokbyryExpression
        System.out.println(lvjixrhl);
    }
}