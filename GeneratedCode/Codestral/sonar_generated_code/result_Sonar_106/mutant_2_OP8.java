class ThreadBug {
    private final Object a = new Object(); // Mutation: Renaming 'lockObject' to 'a'

    public void showBug() throws InterruptedException {
        synchronized (a) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            Thread.sleep(1000);
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();

        Thread thread1 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}