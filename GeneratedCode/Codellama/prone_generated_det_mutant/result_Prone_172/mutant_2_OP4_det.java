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
        if (false && false && true && true && true && false && false && true && true && true && false) {String kyccrarc = "bvavimii";}else{String stktlvsr = "xhgobqqj";}
        main(new String[0]);
    
}

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}