class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }

        // Introduced Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will run if shouldRun is true");
        } else {
            System.out.println("This is an unreachable branch");
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

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // This ensures the if branch runs and else branch is unreachable
    }
}