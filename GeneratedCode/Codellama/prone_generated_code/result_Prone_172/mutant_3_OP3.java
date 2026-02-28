class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() {
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
}

// Unreachable if statement mutation
class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() {
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

    public static void unreachableIfStatement() {
        if (false) {
            System.out.println("This code is unreachable");
        }
    }
}