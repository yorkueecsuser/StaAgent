import java.lang.System;

class BuggyCode {
    public float showBug() {
        float myNumber = 3.146f;
        boolean myNumberEquals3point146 = myNumber == 3.146f;
        boolean myNumberNotEquals3point146 = myNumber!= 3.146f;
        boolean myNumberLessThan4OrGreaterThan4 = myNumber < 4 || myNumber > 4;
        if (myNumberEquals3point146) { 
            System.out.println("myNumber is equal to 3.146");
        }
        if (myNumberNotEquals3point146) { 
            System.out.println("myNumber is not equal to 3.146");
        }
        if (myNumberLessThan4OrGreaterThan4) { 
            System.out.println("myNumber is less than 4 or greater than 4");
        }

        float zeroFloat = 0.0f;
        boolean zeroFloatEquals0 = zeroFloat == 0;
        if (zeroFloatEquals0) { 
            System.out.println("zeroFloat is equal to 0");
        }

        // Unreachable for loop
        for(int i=0; false; i++) {
            System.out.println("This is an unreachable loop");
        }

        return myNumber;
    }
}