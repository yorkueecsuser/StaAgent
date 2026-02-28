class FinalizeBug {
    public void showBug() {
        System.gc();
        Bar b = new Bar();
        boolean unreachableWhile = getCondition();
        while (unreachableWhile) { // Mutant: Unreachable while loop
            // This block is unreachable because the condition is always false
            System.out.println("This is an unreachable while loop");
        }
        try {
            b.finalize();
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