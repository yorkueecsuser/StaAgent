class BuggyCode {
    private int counterValue = 0; // Renamed 'counter' to 'counterValue'

    public int showBug(int input) {
        assert incrementCounter() == input; // 'counter' not renamed as it's part of the bug rule
        return counterValue;
    }

    private int incrementCounter() {
        return ++counterValue; // Updated to use the renamed 'counterValue'
    }
}