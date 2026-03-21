import java.util.concurrent.*;

class VirtualThreadBug {
public void showBug() {
    Thread t = Thread.ofVirtual().unstarted(()-> { });
    t = Thread.ofVirtual().unstarted(()-> { });
    t.setPriority(1);
    t.setDaemon(false);
    t.setDaemon(true);
    t.start();
    var threadGroup = t.getThreadGroup();
}
}