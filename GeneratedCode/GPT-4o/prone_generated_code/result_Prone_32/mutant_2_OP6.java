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

    // Method to provide a false condition dynamically
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        
        // Inserting unreachable for loop
        boolean conditionFor = example.getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
        
        System.out.println(example.showBug());
    }
}