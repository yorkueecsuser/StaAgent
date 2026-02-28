class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setPriority(1); // Duplicated assignment
        t.setDaemon(false);
        t.setDaemon(false); // Duplicated assignment
        t.start();
        var threadGroup = t.getThreadGroup();
        var threadGroupDuplicate = t.getThreadGroup(); // Duplicated assignment
        System.out.println(threadGroup.getName());
        System.out.println(threadGroupDuplicate.getName()); // Duplicated usage
    }

    public static void main(String[] args) {
        showBug();
    }
}