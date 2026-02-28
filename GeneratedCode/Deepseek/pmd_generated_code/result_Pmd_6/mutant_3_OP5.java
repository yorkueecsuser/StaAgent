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
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();

        int val = 1;
        boolean condition = false; // mutant added

        // Unreachable switch statement mutant
        switch (val) {
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Default");
                break;
        }

        // If statement to avoid unreachable statement error
        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
    }
}