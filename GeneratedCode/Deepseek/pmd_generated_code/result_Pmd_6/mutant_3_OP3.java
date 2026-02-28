class DemoBug {
    private static class Bar {
        public boolean finalizeCalled = false;

        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); // BUG: AvoidCallingFinalize
            finalizeCalled = true;
        }
    }

    public void showBug() {
        Bar b = new Bar();
        b.finalize();
        if (false) {
            if (!b.finalizeCalled) {
                throw new AssertionError("Finalize should not be called");
            }
        }
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}