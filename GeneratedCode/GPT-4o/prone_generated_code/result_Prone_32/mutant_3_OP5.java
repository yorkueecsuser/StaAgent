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

    // Method to simulate condition for unreachable switch statement
    private int getSwitchCondition() {
        return 0; // Always returns 0, ensuring the switch is unreachable
    }

    public void demonstrateUnreachableSwitch() {
        int condition = getSwitchCondition();
        
        switch (condition) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                // Unreachable code, as 'condition' will never be 1 or 2
                System.out.println("Default case");
                break;
        }
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
        example.demonstrateUnreachableSwitch();
    }
}