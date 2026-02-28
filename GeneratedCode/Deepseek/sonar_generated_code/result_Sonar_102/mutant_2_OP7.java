public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
        lock.notify();
        notifyList.add(1);
    }

    // New mutant code
    boolean alwaysFalse = false;
    while (alwaysFalse) {
        System.out.println("This while loop is unreachable.");
    }

    return notifyList;
}