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
        boolean shouldRun = getCondition();
        switch (0) {
            case 1:
                if (shouldRun) {
                    System.out.println("Unreachable switch added");
                }
                break;
            default:
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }
}