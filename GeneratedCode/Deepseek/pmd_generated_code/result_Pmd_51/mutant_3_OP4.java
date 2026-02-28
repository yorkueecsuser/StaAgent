class JumbledIncrementerRule1 {
    public void foo() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            }
        }
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Original code
        }
        else {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }

    public void showBug() {
        foo();
    }

    private boolean getCondition() {
        return false;
    }
}