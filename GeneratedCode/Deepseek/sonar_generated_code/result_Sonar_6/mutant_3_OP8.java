import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority(1); 
        t.setDaemon(false); 
        t.setDaemon(true); 
        t.start();
        var threadGroup = t.getThreadGroup(); 
        t.getThreadGroup(); // mutant code
        t.setDaemon(true); // mutant code
        t.getThreadGroup(); // mutant code
        t.getThreadGroup(); // mutant code
        t.setDaemon(false); // mutant code
    }
}