class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    private void throwNullException() throws Exception {
        boolean conditionWhile = getCondition(); // Using a method call to avoid compile-time constant
        while (conditionWhile) {
            // This is an unreachable while loop
        }
        throw null; // BUG: ThrowNull
    }

    private boolean getCondition() {
        return false; // This method ensures the while loop is unreachable at runtime
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}