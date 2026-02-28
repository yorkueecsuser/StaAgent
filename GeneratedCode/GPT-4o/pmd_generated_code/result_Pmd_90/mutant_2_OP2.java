class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroupExample example = new ThreadGroupExample();
        System.out.println(example.showBug("Example Group"));
    }

    public String showBug(String groupName) {
        ThreadGroup tg = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(groupName); // Duplicated assignment
        tg = new ThreadGroup(tg, "Subgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "Subgroup"); // Duplicated assignment
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // Duplicated assignment
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // Duplicated assignment
        return tg.getName();
    }
}