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
        return tg.getName();
    }

    // Mutant 1: Renaming a variable
    public String showBugMutant1(String groupName) {
        ThreadGroup x = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        x = new ThreadGroup(x, "Subgroup"); // BUG: AvoidThreadGroup
        x = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        x = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        return x.getName();
    }
}