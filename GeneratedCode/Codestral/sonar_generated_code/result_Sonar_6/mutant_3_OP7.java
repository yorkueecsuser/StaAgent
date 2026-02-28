class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");

            boolean unreachableCondition = false;
            while (unreachableCondition) {
                // This code will never be executed
            }

        });
        t.setPriority(1);
        t.setDaemon(false);
        t.start();
        var threadGroup = t.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}