class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setDaemon(false);

        // Unreachable if-else statement mutant
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This line should never be reached.");
        } else {
            // Continue with the original code
            t.start();
            var threadGroup = t.getThreadGroup();
            System.out.println(threadGroup.getName());
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}