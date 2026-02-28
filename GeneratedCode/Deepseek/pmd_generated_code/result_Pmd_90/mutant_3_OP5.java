class AvoidThreadGroup {
    void buz() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup
        int value = 1;
        switch(value) {
            case 1: // Unreachable switch case
                break;
        }
    }

    public void showBug() {
        buz();
    }
}