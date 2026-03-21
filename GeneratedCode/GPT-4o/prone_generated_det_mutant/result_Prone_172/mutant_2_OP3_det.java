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
                preventMissionCriticalDisasters();
            if (true && true && false && true && true && false && false && false && false && true && false) {int svbasfma = 447462956;}
            }
        }); // BUG: UnusedAnonymousClass
    
}

    private void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}