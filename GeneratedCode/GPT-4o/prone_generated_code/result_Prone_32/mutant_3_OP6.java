class DeadThreadExample {

    public String showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // BUG: DeadThread
        // The thread is created but never started
        return "Thread created but not started"; // To demonstrate the bug
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());

        // Inserting an unreachable for loop mutation
        boolean executeLoop = getUnreachableCondition();
        for (int i = 0; executeLoop; i++) {
            System.out.println("This will never execute");
        }
    }

    // A method to ensure the for loop condition is never true
    private static boolean getUnreachableCondition() {
        return false; // The loop condition is never satisfied
    }
}