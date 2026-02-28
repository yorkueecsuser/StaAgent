class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        boolean unreachableCondition = getUnreachableCondition(); // New line
        if (unreachableCondition) { // New line
            System.out.println("This line is unreachable"); // New line
        } // New line
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean getUnreachableCondition() { // New method
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