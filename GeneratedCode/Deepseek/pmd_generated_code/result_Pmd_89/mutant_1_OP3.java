public void showBug() {
    // code that doesn't need mutual exclusion
    synchronized(this) {
        // code that requires mutual exclusion
        try {
            counter++;
            System.out.println("Counter: " + counter);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // BUG: AvoidSynchronizedStatement
    }
    // more code that doesn't need mutual exclusion
}