class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
        preventMissionCriticalDisasters(); // <-- Mutant code
    }

    public static void showBug() {
        main(new String[0]);
    }

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}