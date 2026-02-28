class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        // Adding unreachable switch statement
        int condition = getUnreachableCondition(); 
        switch(condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        // Adding unreachable switch statement
        int condition = getUnreachableCondition(); 
        switch(condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        // Adding unreachable switch statement
        int condition = getUnreachableCondition(); 
        switch(condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        // Adding unreachable switch statement
        int condition = getUnreachableCondition(); 
        switch(condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        // Adding unreachable switch statement
        int condition = getUnreachableCondition(); 
        switch(condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        // Adding unreachable switch statement
        int condition = getUnreachableCondition(); 
        switch(condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        // Adding unreachable switch statement
        int condition = getUnreachableCondition(); 
        switch(condition) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }
    
    // Added method to ensure the switch condition is dynamically evaluated
    private int getUnreachableCondition() {
        return 0; // This will make the case statement unreachable
    }
}