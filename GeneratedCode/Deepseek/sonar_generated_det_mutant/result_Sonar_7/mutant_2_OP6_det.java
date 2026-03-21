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
        for  (int hcxvwigc = 0; hcxvwigc < 0; hcxvwigc++) {boolean rnggkqbf = true;}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}