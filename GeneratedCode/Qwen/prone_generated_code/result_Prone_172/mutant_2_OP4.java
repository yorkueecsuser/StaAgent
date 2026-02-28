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
                // Mutant code start
                boolean shouldRun = getCondition();
                if (shouldRun) {
                    System.out.println("This will never be printed because shouldRun is always false.");
                } else {
                    System.out.println("This will also never be printed because shouldRun is always false.");
                }
                // Mutant code end
            }
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}