import java.lang.Thread;

class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(() -> {
            // some task
        });
        t.setPriority_Renamed(1); // Mutation: Renamed "setPriority"
        t.setDaemon_Renamed(false); // Mutation: Renamed "setDaemon"
        t.setDaemon_Renamed(true); // Mutation: Renamed "setDaemon"
        t.start();
        var threadGroup = t.getThreadGroup_Renamed(); // Mutation: Renamed "getThreadGroup"
    }
}