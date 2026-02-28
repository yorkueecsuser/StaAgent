class ArrayBug {
    public Object showBug(int[] array) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code executed");
        }
        return array.hashCode() + " " + array.toString();
    }
}