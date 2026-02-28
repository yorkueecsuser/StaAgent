class BitwiseBug {
    private boolean getFalseCondition() {
        // Mock method to return false
        return false;
    }

    public boolean showBug(int number) {
        if ((number & 0) == 0) {
            return true;
        } else {
            boolean unreachableCondition = getFalseCondition();
            if (unreachableCondition) {
                // unreachable code
                System.out.println("This code should never execute");
            }
            return false;
        }
    }
}