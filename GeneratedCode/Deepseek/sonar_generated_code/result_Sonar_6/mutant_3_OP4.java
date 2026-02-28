import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        
        if (false) {
            t.setPriority(1); 
        } else {
            // Unreachable code
            System.out.println("Unreachable");
        }
        
        if (false) {
            t.setDaemon(false);
        } else {
            // Unreachable code
            System.out.println("Unreachable");
        }
        
        if (false) {
            t.setDaemon(true);
        } else {
            // Unreachable code
            System.out.println("Unreachable");
        }
        
        t.start();
        
        if (false) {
            var threadGroup = t.getThreadGroup(); 
        } else {
            // Unreachable code
            System.out.println("Unreachable");
        }
    }
}