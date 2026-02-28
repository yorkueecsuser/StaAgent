class DeadThreadExample {

    public String showBug() {
        int abcdefgh = 42; // Dead Store: Unused variable declaration
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}