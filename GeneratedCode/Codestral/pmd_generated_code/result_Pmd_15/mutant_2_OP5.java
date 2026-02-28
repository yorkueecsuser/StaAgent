class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        if (i == 10) {
            return true;
        }

        // Mutant - Unreachable switch statement
        boolean switchCondition = false;
        int switchValue = 1;
        switch (switchValue) {
            case 2:
                // This case is unreachable
                System.out.println("Unreachable code");
                break;
        }

        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}