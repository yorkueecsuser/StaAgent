class FinalizeBug {
    public void showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop mutation
            // This loop is unreachable because conditionFor is always false
        }
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
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