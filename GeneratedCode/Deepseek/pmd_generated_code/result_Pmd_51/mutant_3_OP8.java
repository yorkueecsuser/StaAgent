class JumbledIncrementerRule1 {
    public void foo() {
        for (int i = 0; i < 10; i++) {
            for (int q = 0; q < 20; q++) {
                System.out.println("Hello");
            }
        }
    }
    public void showBug() {
        foo();
    }
}