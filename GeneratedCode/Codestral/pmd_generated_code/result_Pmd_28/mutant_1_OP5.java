class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        int value = getUnreachableValue(); // new method to get an unreachable value
        switch(value) { // unreachable switch statement
            case 1:
                System.out.println("This statement is unreachable");
                break;
            default:
                break;
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    private int getUnreachableValue() {
        return -1; // always returns a value that is not 1
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }
}