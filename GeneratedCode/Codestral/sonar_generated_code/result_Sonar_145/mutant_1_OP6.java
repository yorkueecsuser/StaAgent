class ArrayBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(int[] array) {
        // Added unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This is an unreachable loop");
        }

        return array.hashCode() + " " + array.toString();
    }
}