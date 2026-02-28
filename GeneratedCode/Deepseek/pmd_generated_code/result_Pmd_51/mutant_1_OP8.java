class JumbledIncrementerRule1 {
    public void foo() {
        for (int x = 0; x < 10; x++) {
            for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            }
        }
    }
    public void showBug() {
        foo();
    }
}