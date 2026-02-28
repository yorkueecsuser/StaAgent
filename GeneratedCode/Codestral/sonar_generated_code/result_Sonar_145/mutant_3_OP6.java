class ArrayBug {
    public Object showBug(int[] array) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable loop added based on the mutation operator description
        }
        return array.hashCode() + " " + array.toString();
    }

    // Method to return condition for dynamically determining the loop condition
    private boolean getCondition() {
        return false;
    }
}