class ThreadRunBugExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly

        // Mutant code
        Thread a = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        a.start(); // Correct way to start a thread
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();

        // Mutant code
        ThreadRunBugExample b = new ThreadRunBugExample();
        b.showBug();
    }
}