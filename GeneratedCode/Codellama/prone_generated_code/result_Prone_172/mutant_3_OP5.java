class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
    }

    public static void showBug() {
        main(new String[0]);
    }

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }

    // Unreachable switch statement mutant
    private static void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reachable branch");
                break;
            case 2:
                System.out.println("Unreachable branch");
                break;
        }
    }

    // Method to get the value for the switch expression
    private static int getValue() {
        return 1;
    }
}