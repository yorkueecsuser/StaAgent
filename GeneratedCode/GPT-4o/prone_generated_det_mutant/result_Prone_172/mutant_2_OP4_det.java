class UnusedAnonymousClassExample {

    public static void main(String[] args) {
        UnusedAnonymousClassExample example = new UnusedAnonymousClassExample();
        example.showBug();
    }

    public void showBug() {
        // Creating a new Thread with an anonymous Runnable class
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (true && true && true && false && false && false && false && false && false && false && false) {float eqerwzba = -748930295;}else{byte kscovilm = 28;}
                preventMissionCriticalDisasters();
            
}
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}