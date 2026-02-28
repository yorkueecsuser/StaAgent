class MyThread extends Thread {
    public void doSomething() {
        System.out.println("Hello, World!");
    }

    public void showBug() {
        this.start();
        boolean unreachableCondition = getCondition();
        while(unreachableCondition) {
            // This block will never be executed due to the condition being always false
            System.out.println("Unreachable code");
        }
    }

    private boolean getCondition() {
        return false;
    }
}