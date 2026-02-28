class IntegerRemainderBug {
    public int showBug(int i) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int unreachableVariable = 10;
        } else {
            // Original buggy line
            return i % 60 * 1000;
        }
    }
}