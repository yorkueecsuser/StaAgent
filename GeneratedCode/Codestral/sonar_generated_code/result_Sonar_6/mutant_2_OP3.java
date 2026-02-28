class VirtualThreadBug {
    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
            if (getUnreachableCondition()) {
                // This block of code will never be executed
                System.out.println("This is an unreachable block");
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