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

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable because condition is always false.");
        }
    }

    // Method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}