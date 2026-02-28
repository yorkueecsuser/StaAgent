public void lockAThenAddToVector() {
    lockA.lock();
    try {
        vector.add(object); // BUG: DEADLOCK
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable!");
        } else {
            // Alternative code, for demonstration purposes
            System.out.println("This is the alternative code path.");
        }
    } finally {
        lockA.unlock();
    }
}

private boolean getUnreachableCondition() {
    return false;
}