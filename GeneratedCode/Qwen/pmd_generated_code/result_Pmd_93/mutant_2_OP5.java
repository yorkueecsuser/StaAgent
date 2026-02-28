class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun

        // Introduced Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
            case 1:
                // This case will always be executed
                System.out.println("This is always printed");
                break;
        }

        return "Bug demonstrated";
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always evaluate to 1
        return false;
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}