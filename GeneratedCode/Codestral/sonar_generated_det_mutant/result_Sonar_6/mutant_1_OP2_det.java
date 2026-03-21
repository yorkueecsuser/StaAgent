class VirtualThreadBug {
public void showBug() {
    Thread t = Thread.ofVirtual().unstarted(()-> { });
    t = Thread.ofVirtual().unstarted(()-> { });
    t.setPriority(1);
    try { t.setDaemon(false); } catch(IllegalArgumentException e){ e.printStackTrace(); }
    t.start();
    var threadGroup = t.getThreadGroup();
}

    public static void main(String[] args) {
        VirtualThreadBug bug = new VirtualThreadBug();
        bug.showBug();
    }
}