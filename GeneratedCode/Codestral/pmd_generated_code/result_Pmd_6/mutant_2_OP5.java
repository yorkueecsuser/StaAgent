class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        try {
            b.finalize(); // AvoidCallingFinalize
            // Inserted unreachable switch statement
            switch (getFalseCondition()) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
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

    // Method that always returns false to make the switch statement unreachable
    private boolean getFalseCondition() {
        return false;
    }
}