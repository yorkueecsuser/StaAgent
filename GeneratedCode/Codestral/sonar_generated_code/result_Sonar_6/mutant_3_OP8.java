class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setDaemon(false);
        t.start();
        var r = t.getThreadGroup();
        System.out.println(r.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}