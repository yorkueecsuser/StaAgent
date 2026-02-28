class BitwiseOperationBug {
    private static final int CONSTANT = -1;
    private static final int UNREACHABLE_VALUE = 1;

    public boolean showBug(int val) {
        // Original bug
        boolean buggyResult = ((val & CONSTANT) > 0);

        // Unreachable switch statement
        switch(UNREACHABLE_VALUE) {
            case 2:
                System.out.println("This line will never be executed.");
                break;
        }

        return buggyResult;
    }
}