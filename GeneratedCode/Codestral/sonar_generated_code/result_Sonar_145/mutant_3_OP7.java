class ArrayBug {
    public Object showBug(int[] array) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code block");
        }
        return array.hashCode() + " " + array.toString();
    }

    private boolean getCondition() {
        // This method returns false to make the while loop unreachable
        return false;
    }
}