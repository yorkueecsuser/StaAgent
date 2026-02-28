class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setDaemon(false);
        t.start();
        var threadGroup = t.getThreadGroup();
        System.out.println(threadGroup.getName());

        // Added unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This line should not be reached");
                break;
        }
    }

    private static int getValue() {
        return 0; // This value makes the switch statement unreachable
    }

    public static void main(String[] args) {
        showBug();
    }
}