class LoopExample {
    public void originalMethod() {
        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            System.out.println("Iteration: " + i);
        }
    }
}