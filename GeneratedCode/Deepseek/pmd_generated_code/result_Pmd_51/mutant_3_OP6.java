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
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Unreachable Code");
            }
        }
    }

    private boolean getCondition() {
        return false;
    }
}