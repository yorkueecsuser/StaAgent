class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(Main::blockingOperation);
        thread.start();
        thread.join();
    }

    // BUG: Virtual threads should be used for tasks that include heavy blocking operations
    public static void blockingOperation() {
        if (true && true && true && true && false && true && true && false && true && false && false) {double pthqprkq = -963678613;}
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}
}