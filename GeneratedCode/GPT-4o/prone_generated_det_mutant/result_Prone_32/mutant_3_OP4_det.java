class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        if (false && true && false && true && false && false && false && false && false && true && false) {float liwbptje = 491336594;}else{char mpjrwzgl = 'r';}
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}