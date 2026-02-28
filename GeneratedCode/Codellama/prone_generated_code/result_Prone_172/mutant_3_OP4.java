class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            preventMissionCriticalDisasters();
        } else {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static void showBug() {
        main(new String[0]);
    }

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }

    private static boolean getCondition() {
        return false;
    }
}