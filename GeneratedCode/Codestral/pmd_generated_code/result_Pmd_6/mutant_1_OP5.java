class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        int switchValue = getFalseValue(); // Dynamically determine the switch expression
        switch (switchValue) {
            case 1:
                // This case is unreachable
                break;
        }
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private int getFalseValue() {
        return 0; // Always returns 0 to make the switch unreachable
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}