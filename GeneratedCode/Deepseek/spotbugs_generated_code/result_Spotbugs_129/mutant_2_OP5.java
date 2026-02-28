class ShiftBug {
    private boolean getCondition() {
        return false;
    }

    public int showBug(int x, int y) {
        int value = x << 8 + y; // Original bug is still present

        if (getCondition()) { // This condition is always false
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }

        return value;
    }
}