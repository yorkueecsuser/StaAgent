class FinalizeBug {
    public void showBug() {
        System.gc();
        Bar b = new Bar();
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable if statement added
            System.out.println("Unreachable code executed");
        }
        try {
            b.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
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