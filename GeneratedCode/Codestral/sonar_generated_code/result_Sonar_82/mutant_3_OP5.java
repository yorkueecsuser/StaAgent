class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        int value = getUnreachableValue(); // Added method to ensure unreachable condition
        switch(value) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
        }
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    private int getUnreachableValue() {
        return -1; // This value will never be 1, ensuring the switch case is unreachable
    }
}