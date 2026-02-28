class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        thread.run();
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This is an unreachable switch statement.");
                break;
        }
        return "Bug executed.";
    }

    private int getValue() {
        return 0; // To ensure the switch statement is unreachable
    }
}