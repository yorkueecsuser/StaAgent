public void lockAThenAddToVector() {
    lockA.lock();
    try {
        int value = 0;
        switch(value) {
            case 1:
                // This code will never be executed
                break;
        }
        vector.add(object);
    } finally {
        lockA.unlock();
    }
}