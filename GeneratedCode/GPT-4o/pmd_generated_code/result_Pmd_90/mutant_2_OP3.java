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

        boolean condition = getFalseCondition(); // method to ensure the condition is dynamically determined
        if (condition) {
            System.out.println("This branch is unreachable.");
        }

        return tg.getName();
    }

    private boolean getFalseCondition() {
        return false; // This is intentionally always false for the unreachable if statement
    }
}