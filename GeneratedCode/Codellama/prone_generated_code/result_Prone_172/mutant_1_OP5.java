class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
        boolean condition = getCondition();
        if (condition) {
            switch (getValue()) {
                case 1:
                    System.out.println("Preventing disasters...");
                    break;
                default:
                    System.out.println("Preventing disasters...");
                    break;
            }
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

    private static int getValue() {
        return 0;
    }
}