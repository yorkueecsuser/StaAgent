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

// Mutated Code
class ThreadGroupExampleMutant {

    public static void main(String[] args) {
        ThreadGroupExampleMutant example = new ThreadGroupExampleMutant();
        System.out.println(example.showBug("Example Group"));
    }

    public String showBug(String groupName) {
        ThreadGroup x = new ThreadGroup(groupName); // Renamed variable tg to x
        x = new ThreadGroup(x, "Subgroup");
        x = Thread.currentThread().getThreadGroup();
        x = System.getSecurityManager().getThreadGroup();
        return x.getName();
    }
}