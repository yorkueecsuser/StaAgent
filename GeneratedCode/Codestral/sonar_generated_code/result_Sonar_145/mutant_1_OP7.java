class ArrayBug {
    public Object showBug(int[] array) {
        boolean unreachableCondition = getUnreachableCondition(); // Added method to dynamically return false
        while (unreachableCondition) { // Unreachable while loop
            System.out.println("This line should never execute.");
        }
        return array.hashCode() + " " + array.toString();
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the while loop unreachable
    }
}