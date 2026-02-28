public void notifyOneThread() {
    synchronized (this) {
        if (!waitingThreads.isEmpty()) {
            // Mutant: Unreachable for loop
            for (int j = 0; false; j++) {
                System.out.println("This loop is unreachable");
            }

            waitingThreads.get(0).notify();
            waitingThreads.remove(0);
        }
    }
}