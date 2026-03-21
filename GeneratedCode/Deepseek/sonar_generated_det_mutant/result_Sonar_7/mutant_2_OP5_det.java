class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(Main::blockingOperation);
        thread.start();
        thread.join();
    }

    // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    public static void blockingOperation() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        int xnnxzuub = 0;switch  (xnnxzuub) {case 1:int qkdkdcoo = 896427107;break;default:double lkubhysy = -360854845;break;}
        }
    
}
}