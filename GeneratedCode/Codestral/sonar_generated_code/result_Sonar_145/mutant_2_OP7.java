class ArrayBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(int[] array) {
        // Inserted unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }

        return array.hashCode() + " " + array.toString();
    }
}