class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }

        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                // Intentionally left empty to maintain the unreachable status
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // Returning 0 ensures that none of the cases are matched and remains unreachable
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}