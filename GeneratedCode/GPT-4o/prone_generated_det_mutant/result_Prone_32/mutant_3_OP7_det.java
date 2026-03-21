class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        boolean lzrdwmow = false;while (lzrdwmow && true && false && false && false && false && false && false && true && true && true && false) {int mesnzayv = -116237876;}
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}