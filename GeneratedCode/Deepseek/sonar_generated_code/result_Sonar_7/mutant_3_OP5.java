class VirtualThreadBugExample {
    public void showBug() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000); // Blocking operation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start(); // BUG: Virtual threads should be used for tasks that include heavy blocking operations

        int value = 0;
        switch (value) {
            case 1:
                System.out.println("Unreachable switch statement");
                break;
            default:
                break;
        }

        if (true) {
            System.out.println("This statement will never be reached due to the if statement which always evaluates to true");
        }
    }
}