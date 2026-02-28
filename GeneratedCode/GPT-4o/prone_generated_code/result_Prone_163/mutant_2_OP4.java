class NullThrowExample {

    public void showBug() {
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This message will never be printed.");
        } else {
            try {
                throwNullException(); // This will cause a NullPointerException
            } catch (Exception e) {
                System.out.println("Caught an exception: " + e);
            }
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }

    private boolean getCondition() {
        return false; // Ensures the if-block is never executed
    }
}