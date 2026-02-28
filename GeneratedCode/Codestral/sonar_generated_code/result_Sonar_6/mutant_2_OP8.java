class VirtualThreadBug {
    public static void showBug() {
        Thread vt = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        vt.setPriority(1);
        vt.setDaemon(false);
        vt.start();
        var threadGroup = vt.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}