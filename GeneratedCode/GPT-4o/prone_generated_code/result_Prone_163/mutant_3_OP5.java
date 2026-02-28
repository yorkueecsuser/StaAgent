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
                System.out.println("This is case 1.");
                break;
            case 2:
                System.out.println("This is case 2.");
                break;
            default:
                // This default block makes the switch statement syntactically correct.
                break;
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    private int getUnreachableValue() {
        // This method ensures the switch statement remains unreachable.
        return 0; // Always returns 0, making the switch cases unreachable.
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}