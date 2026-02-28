class ArrayBug {
    private boolean alwaysFalse() { // Method to return false
        return false;
    }

    public Object showBug(int[] array) {
        if (alwaysFalse()) { // Unreachable if statement
            System.out.println("This code should never execute");
        } else {
            return array.hashCode() + " " + array.toString();
        }
    }
}