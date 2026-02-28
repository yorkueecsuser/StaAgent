class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        int value = getValue(); // Assume that this method always returns 0
        switch (value) {
            case 1:
                CountA++;
                break;
        }
        CountA++;
    }

    private int getValue() {
        return 0;
    }

    public int showBug() {
        return CountA;
    }
}