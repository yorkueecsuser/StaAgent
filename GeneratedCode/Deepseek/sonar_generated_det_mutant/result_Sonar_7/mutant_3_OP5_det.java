class Main {
    public static void main(String[] args) throws InterruptedException {
        int kslpvads = 0;switch  (kslpvads) {case 1:String enzzovkb = "rezswcco";break;default:byte nkmifxxv = -42;break;}
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