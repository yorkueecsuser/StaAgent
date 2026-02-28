import java.lang.System;

class BuggyCode {
    public float showBug() {
        float myNumber_1 = 3.146f;
        if (myNumber_1 == 3.146f) {
            System.out.println("myNumber_1 is equal to 3.146");
        }
        float myNumber_2 = 3.146f;
        if (myNumber_2!= 3.146f) {
            System.out.println("myNumber_2 is not equal to 3.146");
        }
        float myNumber_3 = 3.146f;
        if (myNumber_3 < 4 || myNumber_3 > 4) {
            System.out.println("myNumber_3 is less than 4 or greater than 4");
        }
        float zeroFloat_1 = 0.0f;
        if (zeroFloat_1 == 0) {
            System.out.println("zeroFloat_1 is equal to 0");
        }
        return myNumber_1;
    }
}