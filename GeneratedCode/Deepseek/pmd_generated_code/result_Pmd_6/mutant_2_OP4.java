class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); // BUG: AvoidCallingFinalize
        }
    }

    public void showBug() {
        Bar b = new Bar();
        b.finalize();
        // Mutation: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This line won't be executed due to the unreachable if-else statement mutation.");
        } else {
            System.out.println("This line is reachable due to the unreachable if-else statement mutation.");
        }
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}