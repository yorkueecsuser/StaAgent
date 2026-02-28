import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority(1); // Not a bug anymore
        t.setDaemon(false); // Not a bug anymore
        t.setDaemon(true); // Not a bug anymore
        t.start();
        
        // Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This loop will never be executed"); // Unreachable
        }

        var threadGroup = t.getThreadGroup(); // Not a bug anymore
    }
}