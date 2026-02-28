class ArrayBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Object showBug(int[] array) {
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }

        return array.hashCode() + " " + array.toString();
    }
}