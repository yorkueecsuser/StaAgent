class IntegerRemainderBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int i) {
        if (getFalseCondition()) {
            System.out.println("This line is unreachable");
        }
        return i % 60 * 1000; // Buggy line
    }
}