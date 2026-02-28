class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable or method call to avoid compile-time constant
        if (unreachableCondition) {
            switch (0) { // Unreachable switch statement
                case 1:
                    System.out.println("This code will never be executed.");
                    break;
            }
        }
        return Thread.currentThread().isInterrupted(); // Original bug is still present
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false to make the switch statement unreachable
    }
}