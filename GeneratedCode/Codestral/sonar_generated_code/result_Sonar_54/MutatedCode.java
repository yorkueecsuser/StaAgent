class MutatedCode {
    public void showBug() {
        try {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // Unreachable for loop inserted according to the mutation operator
                System.out.println("Unreachable code");
            }
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    private boolean getCondition() {
        return false; // Always false to make the for loop unreachable
    }

    public static void main(String[] args) {
        MutatedCode bc = new MutatedCode();
        bc.showBug();
    }
}