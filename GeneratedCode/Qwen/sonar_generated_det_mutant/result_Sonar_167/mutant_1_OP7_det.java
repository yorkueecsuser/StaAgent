class ThreadRunExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but will not due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        boolean piyhddlq = false;while (piyhddlq && true && true && true && false && true && false && true && true && true && true && false) {byte mfsfchvj = -19;}
        example.showBug();
    
}
}