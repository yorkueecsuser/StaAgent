class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }

        // Mutant: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("Unreachable case");
                    break;
                default:
                    System.out.println("Default case");
                    break;
            }
        }
    }

    private int getValue() {
        return 0;
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}