class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
            // Mutation Operator: Duplication
            // Duplicating the assignment statement and insert immediately after its current location
            Bar bDuplicate = b; // Unique mutant code added
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}