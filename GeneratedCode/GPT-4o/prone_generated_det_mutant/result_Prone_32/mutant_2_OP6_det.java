class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        for  (int esgwpban = 0; esgwpban < 0; esgwpban++) {double lntyaegg = 716228024;}
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}