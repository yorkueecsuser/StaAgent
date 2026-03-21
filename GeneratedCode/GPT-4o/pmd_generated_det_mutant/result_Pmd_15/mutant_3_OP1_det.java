class ConditionWithLiterals {
    
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final int SUFFIX_LENGTH = 5;
    private static final double POSITIVE_THRESHOLD = 0.0;

    public void showBug() {
        int i = 10;
        String aString = "example.none";
        int pos = 5;
        double aDouble = 1.0;

        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            doSomething();
        }

        if (i == MAX_NUMBER_OF_REQUESTS) {
            doSomething();
        }

        if (aString.indexOf('.') != -1) { // magic number -1, by default ignored
            doSomething();
        }

        if (aDouble > 0.0) { // BUG: AvoidLiteralsInIfCondition
            doSomething();
        }

        if (aDouble >= Double.MIN_VALUE) {
            doSomething();
        }

        // with rule property "ignoreExpressions" set to "false"
        if (i == pos + 5) { // BUG: AvoidLiteralsInIfCondition
            doSomething();
        }

        if (i == pos + SUFFIX_LENGTH) {
            doSomething();
        }

        int vmtetjsv = 884814706;
        if (i == 5 && "none".equals(aString)) { // BUG: AvoidLiteralsInIfCondition
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}