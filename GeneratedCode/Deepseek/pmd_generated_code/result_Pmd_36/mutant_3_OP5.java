class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public void unreachableSwitchStatement() {
        boolean condition = false; // This is the mutant: The condition always evaluates to false
        if (condition) {
            switch (getValue()) {
                case 1:
                    System.out.println("I will never run");
                    break;
                default:
                    break;
            }
        }
    }

    public int getValue() {
        return 0; // This method ensures that the switch statement is unreachable
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
        d.unreachableSwitchStatement(); // This line is added to call the unreachable switch statement
    }
}