class ThreadBug {

    public void showBug() throws InterruptedException {
        Thread a = new Thread(new RunnableJob());
        a.start();
        a.wait(); // Mutated: Renaming'myThread' to 'a'
    }

    private static class RunnableJob implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}