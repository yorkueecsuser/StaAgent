class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroupExample example = new ThreadGroupExample();
        System.out.println(example.showBug("Example Group"));
    }

    public String showBug(String groupName) {
        ThreadGroup tg = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "Subgroup"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        int lmzlrtzk = 0;switch  (lmzlrtzk) {case 1:byte kaecdvsm = 92;break;default:double fzfehxfc = 585826666;break;}
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        return tg.getName();
    
}
}