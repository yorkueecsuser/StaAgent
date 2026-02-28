class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This is an unreachable while loop");
        }
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
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