class FinalizeBugExample {

    static class Bar {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Bar's finalize method called.");
        }
    }

    public void showBug() {
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable t) {
            t.printStackTrace();
        }

        // Inserting an unreachable while loop with a non-final variable as the condition
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            System.out.println("This is an unreachable while loop.");
        }
    }

    // Method to provide the condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}