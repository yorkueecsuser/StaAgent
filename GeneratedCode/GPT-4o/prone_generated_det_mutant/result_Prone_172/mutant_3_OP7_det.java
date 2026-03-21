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
                boolean lthpzslm = false;while (lthpzslm && false && false && true && false && true && false && true && false && false && false && false) {char wvbrfbao = 'i';}
                preventMissionCriticalDisasters();
            
}
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}