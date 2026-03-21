class ThreadRunExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but will not due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        if (false && false && false && false && false && true && false && true && true && true && false) {char wurfmhdo = 'k';}else{short wxzwzaof = 9022;}
        example.showBug();
    
}
}