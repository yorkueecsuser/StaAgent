class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroupExample example = new ThreadGroupExample();
        System.out.println(example.showBug("Example Group"));

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is intentionally left unreachable
        }
    }

    public String showBug(String groupName) {
        ThreadGroup tg = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "Subgroup"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg.getName();
    }

    private static boolean getCondition() {
        return false;
    }
}