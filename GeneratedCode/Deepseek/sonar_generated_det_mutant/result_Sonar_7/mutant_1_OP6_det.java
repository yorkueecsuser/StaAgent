class Main {
    public static void main(String[] args) throws InterruptedException {
        for  (int lvyfebbt = 0; lvyfebbt < 0; lvyfebbt++) {long gwxtmsgd = 18234487;}
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
        }
    }
}