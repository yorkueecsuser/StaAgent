class ThreadRunExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but will not due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        for  (int vziwangp = 0; vziwangp < 0; vziwangp++) {String moaeahiy = "atagnnqv";}
        example.showBug();
    
}
}