import java.util.Date;

class MathOperandBug {

    // Method to demonstrate integer division bug
    public float showBug1() {
        float twoThirds = 2 / 3; // BUG: Math operands should be cast before assignment
        return twoThirds;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Method to demonstrate integer multiplication overflow bug
    public long showBug2() {
        long millisInYear = 1_000 * 3_600 * 24 * 365; // BUG: Math operands should be cast before assignment
        return millisInYear;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Method to demonstrate integer addition overflow bug
    public long showBug3() {
        long bigNum = Integer.MAX_VALUE + 2; // BUG: Math operands should be cast before assignment
        return bigNum;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Method to demonstrate integer subtraction overflow bug
    public long showBug4() {
        long bigNegNum = Integer.MIN_VALUE - 1; // BUG: Math operands should be cast before assignment
        return bigNegNum;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Method to demonstrate date calculation bug due to integer overflow
    public Date showBug5(int seconds) {
        Date myDate = new Date(seconds * 1_000); // BUG: Math operands should be cast before assignment
        return myDate;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Method to demonstrate integer multiplication overflow in method return
    public long compute(int factor) {
        return factor * 10_000; // BUG: Math operands should be cast before assignment
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Method to demonstrate integer division loss of precision bug in method return
    public float compute2(long factor) {
        return factor / 123; // BUG: Math operands should be cast before assignment
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                System.out.println("This will never be printed");
                break;
        }
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically at runtime
    }
}