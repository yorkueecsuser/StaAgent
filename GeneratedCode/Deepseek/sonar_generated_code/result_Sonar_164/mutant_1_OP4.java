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
        if (myNumber > 2) { // This is the mutant
            System.out.println("myNumber is greater than 2");
        }
        float zeroFloat = 0.0f;
        if (zeroFloat == 0) { 
            System.out.println("zeroFloat is equal to 0");
        }
        return myNumber;
    }
}