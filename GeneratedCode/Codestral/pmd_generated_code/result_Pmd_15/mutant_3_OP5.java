class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == MAX_NUMBER_OF_REQUESTS) {
            return true;
        }

        // Mutated code: Adding unreachable switch statement
        switch (getUnreachableValue()) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        return false;
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1 to make the switch statement unreachable
        return 2;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}