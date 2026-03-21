class ThreadRunExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but will not due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        boolean nlojxmkq = false;while (nlojxmkq && true && false && false && false && false && true && false && true && true && false && false) {String jdaodylg = "rdwcgupy";}
        example.showBug();
    
}
}