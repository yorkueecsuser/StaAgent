class VirtualThreadBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            t.setPriority(1);
            t.setDaemon(false);
        } else {
            // Adding a mutant code here
            System.out.println("Unreachable code executed!");
        }

        t.start();
        var threadGroup = t.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}