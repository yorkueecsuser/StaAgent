class AvoidThreadGroupBug {
    private int getUnreachableValue() {
        return -1;
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");

        // Inserting an unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This code is unreachable
                System.out.println("This is an unreachable switch case");
                break;
        }

        tg = new ThreadGroup(tg, "my thread group");
        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}