class ThreadRunExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but will not due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        if (true && false && false && false && false && true && true && true && false && true && false) {int ajnwnvtx = 263851643;}else{short kgeqoqna = -8358;}
        example.showBug();
    
}
}