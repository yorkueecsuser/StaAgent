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
}

// Mutant 1: Renaming the variable "args" to "arg"
class UnusedAnonymousClassBug {
    public static void main(String[] arg) {
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
}

// Mutant 2: Renaming the variable "main" to "run"
class UnusedAnonymousClassBug {
    public static void run(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
    }

    public static void showBug() {
        run(new String[0]);
    }

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}

// Mutant 3: Renaming the variable "showBug" to "display"
class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
    }

    public static void display() {
        main(new String[0]);
    }

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}

// Mutant 4: Renaming the variable "preventMissionCriticalDisasters" to "preventDisasters"
class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventDisasters();
            }
        });
    }

    public static void showBug() {
        main(new String[0]);
    }

    private static void preventDisasters() {
        System.out.println("Preventing disasters...");
    }
}