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

        // Mutation: Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is a reachable statement.");
        } else {
            System.out.println("This is an unreachable statement.");
        }
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false; // This ensures the `else` block is never executed
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}