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

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("This will also never be printed");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        return "Thread created but not started"; // To demonstrate the bug
    }

    private int getUnreachableValue() {
        return 3; // Ensures switch cases are unreachable
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}