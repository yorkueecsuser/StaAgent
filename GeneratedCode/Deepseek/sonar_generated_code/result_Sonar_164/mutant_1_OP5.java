import java.lang.System;

class BuggyCode {
    public float showBug() {
        float myNumber = 3.146f;
        if (myNumber == 3.146f) {
            System.out.println("myNumber is equal to 3.146");
        }
        if (myNumber!= 3.146f) {
            System.out.println("myNumber is not equal to 3.146");
        }
        if (myNumber < 4 || myNumber > 4) {
            System.out.println("myNumber is less than 4 or greater than 4");
        }
        float zeroFloat = 0.0f;
        if (zeroFloat == 0) {
            System.out.println("zeroFloat is equal to 0");
        }

        // MUTANT: Unreachable switch statement
        int mutantValue = getMutantValue();
        switch (mutantValue) {
            default:
                System.out.println("This switch statement is unreachable");
                break;
        }

        return myNumber;
    }

    // Auxiliary method to get mutant value
    private int getMutantValue() {
        return 0;  // compile-time constant, making the switch statement unreachable
    }
}