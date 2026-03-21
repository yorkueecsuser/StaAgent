class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        return Thread.currentThread().isInterrupted(); // Original bug remains
    }
}