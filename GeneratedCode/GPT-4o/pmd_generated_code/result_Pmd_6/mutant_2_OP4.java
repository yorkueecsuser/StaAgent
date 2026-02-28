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

        // Inserting unreachable if-else branch
        boolean condition = getCondition(); // Non-final variable for condition
        if (condition) {
            System.out.println("This will not execute.");
        } else {
            System.out.println("This block is always executed.");
        }
    }

    // Method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // Always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}