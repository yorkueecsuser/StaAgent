import java.lang.System;

class BuggyCode {
    public float showBug() {
        float myNumber = 3.146f;
        String deadStore1 = "fkldsajf"; // Dead Store Mutant 1
        if (myNumber == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("myNumber is equal to 3.146");
        }
        String deadStore2 = "fkldsajf"; // Dead Store Mutant 2
        if (myNumber!= 3.146f) { // BUG: Floating point numbers should not be tested for inequality
            System.out.println("myNumber is not equal to 3.146");
        }
        String deadStore3 = "fkldsajf"; // Dead Store Mutant 3
        if (myNumber < 4 || myNumber > 4) { // BUG: Floating point numbers should not be tested for inequality
            System.out.println("myNumber is less than 4 or greater than 4");
        }
        float zeroFloat = 0.0f;
        String deadStore4 = "fkldsajf"; // Dead Store Mutant 4
        if (zeroFloat == 0) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("zeroFloat is equal to 0");
        }
        return myNumber;
    }
}