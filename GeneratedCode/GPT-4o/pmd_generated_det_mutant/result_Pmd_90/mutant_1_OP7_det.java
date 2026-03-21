class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroupExample example = new ThreadGroupExample();
        System.out.println(example.showBug("Example Group"));
    }

    public String showBug(String groupName) {
        ThreadGroup tg = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "Subgroup"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        boolean zoomdlna = false;while (zoomdlna && false && true && false && true && true && true && true && true && true && true && false) {short rcxmxxvu = -1987;}
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg.getName();
    
}
}