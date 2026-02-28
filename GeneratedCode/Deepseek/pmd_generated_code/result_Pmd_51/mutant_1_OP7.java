class JumbledIncrementerRule1 {
    public void foo() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            }
        }
    }

    public void showBug() {
        foo();

        // Unreachable while loop mutation operator
        boolean condition = false;
        while (condition) {
            System.out.println("Hello");
        }
    }
}