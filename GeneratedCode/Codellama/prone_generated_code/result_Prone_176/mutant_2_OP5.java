import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower
        
        // Mutant code
        switch(getRandomNumber()) {
            case 0:
                // Do nothing
                break;
            case 1:
                // Do something else
                break;
        }
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
    
    // Helper method to generate random number
    private static int getRandomNumber() {
        return new Random().nextInt(2);
    }
}