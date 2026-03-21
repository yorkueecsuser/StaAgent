class JumbledIncrementerRule1 {
    public void foo() {
        { int i = 0; do { for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            } i++; } while (i < 10); }
    }
    public void showBug() {
        foo();
    }
}