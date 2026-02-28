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
        
        // Unreachable if statement added as a mutant.
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    // Method to simulate a condition
    private boolean getCondition() {
        return false; // Ensures the if statement is unreachable
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}