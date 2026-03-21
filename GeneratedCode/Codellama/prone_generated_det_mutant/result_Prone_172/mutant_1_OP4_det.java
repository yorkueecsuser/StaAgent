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
        if (true && true && false && true && false && true && false && false && false && false && false) {byte yamnfsbu = 113;}else{long xyfgzdof = -917845952;}
        main(new String[0]);
    
}

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}