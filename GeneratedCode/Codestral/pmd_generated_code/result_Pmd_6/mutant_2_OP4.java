class FinalizeBug {
    public void showBug() {
        System.gc();
        Bar b = new Bar();
        try {
            b.finalize();
            if (getCondition()) {
                // unreachable block
                System.out.println("This block should never execute");
            } else {
                // alternative block
                System.out.println("Alternative block executes");
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        // This method should return a value that makes the if condition false
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