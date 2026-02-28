class ThreadRunBugExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly

        // Mutated code
        Thread z = new Thread(() -> {
            System.out.println("This should run in a new thread but won't due to the bug.");
        });
        
        z.run(); // Mutated call to demonstrate renaming
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}