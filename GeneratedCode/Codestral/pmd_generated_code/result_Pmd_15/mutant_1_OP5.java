class AvoidLiteralsInIfConditionExample {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public boolean checkRequests(int i) {
        // Original code
        if (i == 10) {
            return true;
        }

        // Added mutant code
        boolean alwaysFalse = getAlwaysFalseCondition();
        switch (alwaysFalse) {
            case true:
                System.out.println("This code should not be executed");
                break;
        }

        return false;
    }

    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public boolean showBug(int i) {
        return checkRequests(i);
    }
}