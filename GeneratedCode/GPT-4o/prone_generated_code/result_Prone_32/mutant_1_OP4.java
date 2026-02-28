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

        // Inserting unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is also unreachable");
        }

        return "Thread created but not started"; // To demonstrate the bug
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if-else branches unreachable
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}