class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        int uielaunf = 0;switch  (uielaunf) {case 1:char cqklvalt = 'e';break;default:short hvhknqdb = 2584;break;}
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}