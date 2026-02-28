import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority(1); 
        t.setDaemon(false);
        t.setDaemon(true);

        // Added switch statement which is unreachable
        int unreachableInt = 0;
        switch (unreachableInt) {
            case 1:
                unreachableInt = 2;
                break;
            case 2:
                unreachableInt = 3;
                break;
            default:
                break;
        }

        t.start();
        var threadGroup = t.getThreadGroup();
    }
}