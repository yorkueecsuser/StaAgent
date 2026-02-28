class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement mutant
            if (getUnreachableCondition()) {
                System.out.println("This block is unreachable");
            }
        }
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        // this method will return a dynamic condition at runtime
        // for the demonstration purpose, let's always return true
        return true;
    }

    private boolean getUnreachableCondition() {
        // this method will return a statically known unreachable condition
        // for the demonstration purpose, let's always return false
        return false;
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}