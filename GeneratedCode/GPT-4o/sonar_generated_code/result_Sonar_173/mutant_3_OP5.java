class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public void showBug() {
        try {
            FinalizeMethodExample example = new FinalizeMethodExample();
            example.dispose();

            // Unreachable switch statement mutation
            int unreachableSwitchCondition = getSwitchCondition(); // Using a method to avoid compile-time constant
            switch (unreachableSwitchCondition) {
                case 999: // Intentionally unreachable case
                    System.out.println("This line is unreachable.");
                    break;
                default:
                    // Do nothing
                    break;
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
    }

    // Helper method to ensure switch condition is non-final and dynamic
    private int getSwitchCondition() {
        return -1; // Always returns -1 to ensure the case 999 is never reached
    }
}