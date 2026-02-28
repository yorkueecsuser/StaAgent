class ArrayBug {
    public Object showBug(int[] array) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
        return array.hashCode() + " " + array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
    }

    private int getUnreachableValue() {
        return -1; // This will always return a value that does not match the case in the switch statement
    }
}