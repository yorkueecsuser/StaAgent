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

// Mutated Code
class ThreadRunBugExampleMutant {

    static class ExampleRunnableMutant implements Runnable {
        @Override
        public void run() {
            System.out.println("Running in: " + Thread.currentThread().getName());
        }
    }

    public void showBug() {
        ExampleRunnableMutant a = new ExampleRunnableMutant();
        Thread b = new Thread(a);

        // Incorrectly calling run() instead of start()
        b.run();  // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunBugExampleMutant c = new ThreadRunBugExampleMutant();
        c.showBug();
    }
}