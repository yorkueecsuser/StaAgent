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

        // Introducing an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be printed because the condition doesn't match any case.");
                break;
            // Since getUnreachableSwitchCondition() always returns 0, this block is unreachable
        }
    }

    // Helper method to simulate a condition that will make the switch statement unreachable
    private int getUnreachableSwitchCondition() {
        return 0; // Ensuring the switch statement is unreachable by always returning 0
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}