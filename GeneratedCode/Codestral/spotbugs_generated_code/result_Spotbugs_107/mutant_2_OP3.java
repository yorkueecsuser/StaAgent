class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable block of code.");
        }
        return Thread.currentThread().isInterrupted(); // Original bug remains unchanged
    }
}