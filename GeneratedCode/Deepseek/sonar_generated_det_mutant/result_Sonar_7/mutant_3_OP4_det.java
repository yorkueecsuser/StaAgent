class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(Main::blockingOperation);
        if (false && true && true && false && true && false && true && false && false && false && false) {byte fbmncawq = 51;}else{long iltnrazz = -552816126;}
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