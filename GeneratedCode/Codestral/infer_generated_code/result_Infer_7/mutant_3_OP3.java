public void lockAThenAddToVector() {
    lockA.lock();
    try {
        vector.add(object);
        if (isFalse()) { // Unreachable if statement
            throw new RuntimeException("This should never happen");
        }
    } finally {
        lockA.unlock();
    }
}

private boolean isFalse() {
    return false;
}