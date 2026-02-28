class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setDaemon(false);
        t.start();
        Thread r = t; // Mutant code: Renamed variable 't' to 'r'
        var threadGroup = r.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}