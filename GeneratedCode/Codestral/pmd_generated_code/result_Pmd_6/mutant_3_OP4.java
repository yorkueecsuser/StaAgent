class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        boolean dummyCondition = getDummyCondition(); // Introducing a dynamically determined condition
        if (dummyCondition) {
            // Dummy branch that will never be executed
            System.out.println("This branch will never be executed");
        } else {
            try {
                b.finalize(); // BUG: AvoidCallingFinalize
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    private boolean getDummyCondition() {
        return false; // Always return false to make the branch unreachable
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}