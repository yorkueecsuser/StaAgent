class ThreadRunExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but will not due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        int objjeqtx = 0;switch  (objjeqtx) {case 1:char xnlqgkbu = 'l';break;default:String nicsentq = "rnflgpun";break;}
        example.showBug();
    
}
}