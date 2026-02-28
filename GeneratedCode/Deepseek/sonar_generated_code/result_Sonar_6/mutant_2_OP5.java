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
        switch(0) { 
            case 1:
            default:
                break;
        }
    }
}