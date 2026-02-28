class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        for (int i = 0; isConditionFalse(); i++) { // Unreachable for loop mutation
            System.out.println("This line will never be printed.");
        }
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean isConditionFalse() {
        return false; // Dynamic determination of the unreachable condition
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}