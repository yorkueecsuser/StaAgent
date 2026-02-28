class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null

        // Unreachable switch statement insertion
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // 999 is never returned by getUnreachableValue()
                System.out.println("Unreachable code block");
                break;
            default:
                // No operation
                break;
        }

        return unboxedResult;
    }

    private int getUnreachableValue() {
        // Always returns a value that will not match the switch case above, making it unreachable
        return 0;
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
}