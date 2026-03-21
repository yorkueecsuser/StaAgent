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
        boolean vvsfnlfn = false;while (vvsfnlfn && false && true && true && true && true && false && false && false && true && true && false) {short klsduzes = 8314;}
        main(new String[0]);
    
}

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}