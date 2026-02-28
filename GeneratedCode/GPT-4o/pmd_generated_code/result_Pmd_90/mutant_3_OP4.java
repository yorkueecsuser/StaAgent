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

        // Insert unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is never executed");
        } else {
            System.out.println("This is the else branch");
        }

        return tg.getName();
    }

    // This method ensures the condition is evaluated at runtime
    private boolean getFalseCondition() {
        return false;
    }
}