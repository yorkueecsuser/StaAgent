class VirtualThreadBugDemo {
public static void showBug() {
    Thread virtualThread = new Thread(()-> { System.out.println("Running in virtual thread"); });
    virtualThread = new Thread(()-> { System.out.println("Running in virtual thread"); });
    virtualThread.setPriority(1);
    try { virtualThread.setDaemon(false); } catch(IllegalArgumentException e){ System.out.println("Caught exception: " + e.getMessage()); }
    virtualThread.setDaemon(true);
    virtualThread.start();
    var threadGroup = virtualThread.getThreadGroup();
    System.out.println("Thread group: " + threadGroup.getName());
}

    public static void main(String[] args) {
        showBug();
    }
}