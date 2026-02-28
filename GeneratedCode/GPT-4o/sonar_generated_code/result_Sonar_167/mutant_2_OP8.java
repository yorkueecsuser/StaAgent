class ThreadRunBugExample {

    static class ExampleRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }

    public void showBug() {
        ExampleRunnable exampleRunnable = new ExampleRunnable();
        Thread thread = new Thread(exampleRunnable);

        // Incorrectly calling run() instead of start()
        thread.run();  // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug();
    }
}

class MutantThreadRunBugExample {

    static class ExampleRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }

    public void showBug() {
        ExampleRunnable a = new ExampleRunnable(); // Renaming exampleRunnable to 'a'
        Thread b = new Thread(a); // Renaming thread to 'b'

        // Incorrectly calling run() instead of start()
        b.run();  // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        MutantThreadRunBugExample example = new MutantThreadRunBugExample();
        example.showBug();
    }
}