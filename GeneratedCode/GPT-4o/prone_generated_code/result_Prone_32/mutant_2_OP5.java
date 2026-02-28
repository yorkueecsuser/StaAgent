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
        // Inserting unreachable switch statement
        int unreachableSwitchCondition = getDynamicValue();
        switch(unreachableSwitchCondition) {
            case 99:
                System.out.println("This is an unreachable switch case");
                break;
            default:
                break;
        }
        return "Thread created but not started"; // To demonstrate the bug
    }

    // Method to ensure switch condition is dynamically evaluated
    private int getDynamicValue() {
        return -1; // Ensures the switch condition doesn't match any case
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}