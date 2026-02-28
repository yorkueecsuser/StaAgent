class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); // BUG: AvoidCallingFinalize
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            Bar b = new Bar();
            b.finalize();
        }
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}