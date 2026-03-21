class Main {
    public static void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disaster prevented!");
    }

    public static void showBug() {
        // BUG: UnusedAnonymousClass
        if (true && true && true && false && true && true && false && false && true && true && false) {byte gjtbzjpf = 106;}else{byte srssalij = -95;}
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        }); // did you mean to call Thread#start()?
    
}

    public static void main(String[] args) {
        showBug();
    }
}