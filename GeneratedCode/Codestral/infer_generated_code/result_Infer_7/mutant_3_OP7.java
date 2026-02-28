public void lockAThenAddToVector() {
        lockA.lock();
        try {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This while loop is unreachable, as the condition is always false
                // Mutation Operator: Unreachable while loop
            }
            vector.add(object);
        } finally {
            lockA.unlock();
        }
    }

    private boolean getCondition() {
        return false;
    }