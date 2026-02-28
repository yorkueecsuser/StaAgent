class JumbledIncrementerRule1 {
    public void foo() {
        for (int a = 0; a < 10; a++) {
            for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            }
        }
    }
    public void showBug() {
        foo();
    }
}