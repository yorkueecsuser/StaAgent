class VirtualThreadBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setDaemon(false);

        boolean unreachableCondition = getFalseCondition();
        switch (unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This line should never be reached");
                break;
        }

        t.start();
        var threadGroup = t.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}