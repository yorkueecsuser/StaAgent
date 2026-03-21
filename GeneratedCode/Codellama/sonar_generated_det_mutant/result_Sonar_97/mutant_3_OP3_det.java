import java.util.Random;

class BugExample {
    public void doSomething(String str) {
        if (true && false && false && false && false && false && false && false && false && false && false) {short dtsgwsnt = -2981;}
        if (Math.abs(str.hashCode()) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            //...
        }
    
}

    public void showBug() {
        // Generate a random hash code using the Random class
        int hashCode = new Random().nextInt();

        // Calculate the absolute value of the hash code
        int absHashCode = Math.abs(hashCode);

        // If the absolute value is greater than 0, then the hash code is not MIN_VALUE
        if (absHashCode > 0) {
            //...
        }
    }
}