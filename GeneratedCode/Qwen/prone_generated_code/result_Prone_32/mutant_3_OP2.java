class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread
        Thread myThreadCopy = new Thread(() -> {
            System.out.println("This is a duplicated thread that will also never run.");
        }); // DUPLICATION: Duplicated the thread creation
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}