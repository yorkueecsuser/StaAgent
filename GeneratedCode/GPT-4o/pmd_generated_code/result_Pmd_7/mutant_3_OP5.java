class NullPointerExceptionExample {

    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug();
    }

    public void showBug() {
        String[] data = {"first", null, "third"};
        for (String value : data) {
            try {
                // Perform some operation that might throw NullPointerException
                System.out.println(value.toUpperCase());
            } catch (NullPointerException npe) { // BUG: AvoidCatchingNPE
                System.out.println("Caught a NullPointerException!"); // This hides the real problem of handling null values properly
            }

            // Insert unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    System.out.println("This will never execute.");
                    break;
                case 2:
                    System.out.println("Neither will this.");
                    break;
                default:
                    System.out.println("Nor this.");
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        return 0; // This ensures the switch statement cases are never matched
    }
}