class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");

        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // Unreachable code
                tg = new ThreadGroup(tg, "my thread group");
                break;
            default:
                // Original code
                tg = Thread.currentThread().getThreadGroup();
                break;
        }

        return tg;
    }

    private int getUnreachableValue() {
        return -1; // This value will never be 1, making the case 1 unreachable
    }
}