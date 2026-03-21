import java.lang.Thread;

class VirtualThreadBugDemo {
public void showBug() {
    Thread t = Thread.ofVirtual().unstarted(()-> { });
    t.setPriority(1);
    try { t.setDaemon(false); } catch(IllegalArgumentException e){ System.out.println("Caught IllegalArgumentException: " + e.getMessage()); }
    t.setDaemon(true);
    t.start();
    var threadGroup = t.getThreadGroup();
    threadGroup = t.getThreadGroup();
    System.out.println("Thread Group: " + threadGroup);
}

    public static void main(String[] args) {
        VirtualThreadBugDemo demo = new VirtualThreadBugDemo();
        demo.showBug();
    }
}