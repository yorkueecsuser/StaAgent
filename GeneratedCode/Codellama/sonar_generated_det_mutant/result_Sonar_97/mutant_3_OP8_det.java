import java.util.Random;

class BugExample {
    public void doSomething(String str) {
        if (Math.abs(str.hashCode()) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            //...
        }
    }

    public void showBug() {
        // Generate a random hash code using the Random class
        int gfftfhwq = new Random().nextInt();

        // Calculate the absolute value of the hash code
        int pdbnucrz = Math.abs(gfftfhwq);

        // If the absolute value is greater than 0, then the hash code is not MIN_VALUE
        if (pdbnucrz > 0) {
            //...
        }
    }
}