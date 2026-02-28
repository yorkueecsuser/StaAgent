class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) { // Unreachable while loop
            // This code is unreachable and will never execute.
            // It's inserted to introduce a mutant based on the given Mutation Operator.
        }
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean getUnreachableCondition() {
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