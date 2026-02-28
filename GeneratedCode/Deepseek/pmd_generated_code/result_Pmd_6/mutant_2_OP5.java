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
        
        // Mutation: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            int x = 0;
            switch (x) {
                case 1:
                    System.out.println("This is an unreachable case in the switch statement");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}