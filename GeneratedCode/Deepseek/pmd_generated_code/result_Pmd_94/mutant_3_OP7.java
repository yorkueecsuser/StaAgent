import java.util.Random;

class BuggyCode {
    Object baz = null;
    Object bar() {
        Random random = new Random();
        boolean condition = random.nextBoolean(); // Non-final variable
        if (baz == null) { 
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
              }
        }

        while (!condition) { // Unreachable while loop with a non-final variable
            System.out.println("This code is unreachable");
        }
        
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}