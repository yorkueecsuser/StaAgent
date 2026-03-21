class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        boolean envngiws = false;while (envngiws && true && true && false && true && true && false && false && true && true && false && false) {char mpltlwgu = 'k';}
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}