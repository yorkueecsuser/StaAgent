class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }

        // Introduced unreachable if statement as per mutation operator
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement");
        }
    }

    private static class Bar {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalizing Bar object");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }
}