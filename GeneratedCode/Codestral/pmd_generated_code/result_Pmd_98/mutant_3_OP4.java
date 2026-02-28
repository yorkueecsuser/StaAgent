public void notifyOneThread() {
    synchronized (this) {
        if (!waitingThreads.isEmpty()) {
            waitingThreads.get(0).notify();
            waitingThreads.remove(0);
        }

        // Unreachable if-else branch
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code executed!");
        } else {
            System.out.println("This code is unreachable and should not be executed.");
        }
    }
}