class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
        int value = getValue();
        switch(value) {
            case 1:
                // code to handle case 1
                break;
            default:
                // code to handle default case
                break;
        }
    }

    public static void showBug() {
        main(new String[0]);
    }

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }

    public static int getValue() {
        return 0;
    }
}