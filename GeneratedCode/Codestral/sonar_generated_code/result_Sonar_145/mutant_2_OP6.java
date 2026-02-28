class ArrayBug {
    public Object showBug(int[] array) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop mutant
            System.out.println("This is an unreachable loop");
        }
        return array.hashCode() + " " + array.toString();
    }

    // Helper method to dynamically determine the condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}