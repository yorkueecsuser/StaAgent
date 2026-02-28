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
        }

        // Mutant addition: Unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This is unreachable because unreachableSwitchValue is always 0.");
                break;
            // The switch statement is effectively unreachable
        }
    }

    private int getUnreachableValue() {
        return 0; // This method returns 0, causing the switch case to be unreachable
    }
}