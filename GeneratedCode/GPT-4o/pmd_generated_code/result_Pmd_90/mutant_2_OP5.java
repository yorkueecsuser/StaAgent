class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroupExample example = new ThreadGroupExample();
        System.out.println(example.showBug("Example Group"));
    }

    public String showBug(String groupName) {
        ThreadGroup tg = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "Subgroup"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup

        // Insert unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This case is never executed.");
                break;
            case 2:
                System.out.println("This is also never executed.");
                break;
            default:
                // No default case to ensure this block remains unreachable
                break;
        }

        return tg.getName();
    }

    private int getUnreachableSwitchValue() {
        // Always returns a value not matching any case in the switch statement
        return 0;
    }
}