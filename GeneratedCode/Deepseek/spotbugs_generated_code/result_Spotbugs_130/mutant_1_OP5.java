class IntegerRemainderBug {
    public boolean getFalseCondition() {
        return false;
    }

    public int showBug(int i) {
        switch (i) { // Added unreachable switch statement
            case 1:
                if (getFalseCondition()) {
                    // This code is unreachable
                }
                break;
        }
        return i % 60 * 1000; // Buggy line
    }
}