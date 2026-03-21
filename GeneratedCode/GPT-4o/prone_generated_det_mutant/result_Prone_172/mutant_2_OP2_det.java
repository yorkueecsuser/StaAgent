class UnusedAnonymousClassExample {
public static void main(String [] args){
    UnusedAnonymousClassExample example = new UnusedAnonymousClassExample();
    example = new UnusedAnonymousClassExample();
    example.showBug();
}

    public void showBug() {
        // Creating a new Thread with an anonymous Runnable class
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}