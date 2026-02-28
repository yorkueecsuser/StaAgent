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
}

// Mutant Code
class ThreadGroupExampleMutant {

    public static void main(String[] args) {
        ThreadGroupExampleMutant example = new ThreadGroupExampleMutant();
        System.out.println(example.showBug("Example Group"));
    }

    public String showBug(String groupName) {
        ThreadGroup a = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        a = new ThreadGroup(a, "Subgroup"); // BUG: AvoidThreadGroup
        a = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        a = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        return a.getName();
    }
}