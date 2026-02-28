class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize

            // Mutant: Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This block is unreachable");
            } else {
                int x = 1 / 0; // This will cause an ArithmeticException to ensure unreachability
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This condition will always be false, making the if block unreachable
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}