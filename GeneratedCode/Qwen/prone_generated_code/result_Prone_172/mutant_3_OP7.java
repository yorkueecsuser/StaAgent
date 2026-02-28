class UnusedAnonymousClassExample {

    public static void main(String[] args) {
        UnusedAnonymousClassExample example = new UnusedAnonymousClassExample();
        example.showBug();
    }

    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        }); // BUG: UnusedAnonymousClass

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This is an unreachable loop.");
        }
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }

    private boolean getCondition() {
        return false;
    }
}