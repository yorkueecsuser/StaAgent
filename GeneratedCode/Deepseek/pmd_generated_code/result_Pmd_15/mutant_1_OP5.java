import java.util.Random;

class BugDemo {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final double MIN_DOUBLE_VALUE = Double.MIN_VALUE;
    private static final int SUFFIX_LENGTH = 5;

    public int showBug() {
        Random rand = new Random();
        int i = rand.nextInt(20);
        int pos = rand.nextInt(10);
        double aDouble = rand.nextDouble();
        String aString = Integer.toString(rand.nextInt(20));

        int buggyLineNumber = 0;
        if (i == 10) { // magic number, buried in a method
            buggyLineNumber = 20;
            doSomething();
        }

        if (i == MAX_NUMBER_OF_REQUESTS) { // preferred approach
            doSomething();
        }

        if (aString.indexOf('.')!= -1) { // magic number -1, by default ignored
            // Unreachable code mutation start
            int unreachable = 1;
            switch (unreachable) {
                case 1:
                    break;
            }
            // Unreachable code mutation end
        }
        if (aString.indexOf('.') >= 0) { } // alternative approach

        if (aDouble > 0.0) { // magic number 0.0
            // Unreachable code mutation start
            int unreachable = 1;
            switch (unreachable) {
                case 1:
                    break;
            }
            // Unreachable code mutation end
        }
        if (aDouble >= MIN_DOUBLE_VALUE) { } // preferred approach

        // with rule property "ignoreExpressions" set to "false"
        if (i == pos + 5) { // violation: magic number 5 within an (additive) expression
            buggyLineNumber = 36;
        }
        if (i == pos + SUFFIX_LENGTH) { } // preferred approach
        if (i == 5 && "none".equals(aString)) { // 2 violations: magic number 5 and literal "none"
            buggyLineNumber = 43;
        }
        return buggyLineNumber;
    }

    private void doSomething() {
        // implementation
    }
}