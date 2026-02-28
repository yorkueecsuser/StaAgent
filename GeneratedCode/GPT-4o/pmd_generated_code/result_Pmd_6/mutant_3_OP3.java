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

        // Inserting unreachable if statement
        boolean isUnreachable = determineUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        }
    }

    private boolean determineUnreachableCondition() {
        // This returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}