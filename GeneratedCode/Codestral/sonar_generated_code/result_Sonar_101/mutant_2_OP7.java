class UnreachableCodeBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
            while (getFalseCondition()) { // Added unreachable while loop
                System.out.println("This line should never execute");
            }
        } else {
            result = 2;
        }
        return result;
    }
}