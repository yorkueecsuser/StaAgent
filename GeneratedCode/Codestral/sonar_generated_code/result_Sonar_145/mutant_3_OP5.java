class ArrayBug {
    public Object showBug(int[] array) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This code should be unreachable.");
                break;
        }
        return array.hashCode() + " " + array.toString();
    }

    private int getUnreachableValue() {
        return -1;
    }
}