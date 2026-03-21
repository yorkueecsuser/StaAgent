class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(Main::blockingOperation);
        if (false && false && true && false && false && true && false && false && true && true && false) {String chiukzhg = "fjkqzfdl";}
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