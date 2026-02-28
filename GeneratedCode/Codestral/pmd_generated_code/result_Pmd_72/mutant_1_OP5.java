class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
        switch (getFalseValue()) { // Unreachable switch statement
            case 1:
                System.out.println("This code is unreachable");
                break;
        }
    }

    public int showBug() {
        return CountA;
    }

    private boolean getFalseValue() { // Method to ensure the switch condition is dynamically determined at runtime
        return false;
    }
}