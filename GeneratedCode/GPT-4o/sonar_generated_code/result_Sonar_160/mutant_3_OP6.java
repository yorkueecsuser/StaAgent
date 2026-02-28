class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        
        // Unreachable for loop added
        boolean conditionFor1 = getConditionFor1();
        for (int i = 0; conditionFor1; i++) {
            // This block is unreachable
        }
        
        return false;
    }

    public boolean showBug2(int a, int b) {
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        
        // Unreachable for loop added
        boolean conditionFor2 = getConditionFor2();
        for (int i = 0; conditionFor2; i++) {
            // This block is unreachable
        }
        
        return false;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        
        // Unreachable for loop added
        boolean conditionFor3 = getConditionFor3();
        for (int i = 0; conditionFor3; i++) {
            // This block is unreachable
        }
        
        return false;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        
        // Unreachable for loop added
        boolean conditionFor4 = getConditionFor4();
        for (int i = 0; conditionFor4; i++) {
            // This block is unreachable
        }
        
        return false;
    }

    public int showBug5() {
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        
        // Unreachable for loop added
        boolean conditionFor5 = getConditionFor5();
        for (int i = 0; conditionFor5; i++) {
            // This block is unreachable
        }
        
        return j;
    }

    public int showBug6() {
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        
        // Unreachable for loop added
        boolean conditionFor6 = getConditionFor6();
        for (int i = 0; conditionFor6; i++) {
            // This block is unreachable
        }
        
        return k;
    }

    public boolean showBug7(String c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    // Simulated method calls to avoid compile-time constant use
    private boolean getConditionFor1() {
        return false;
    }

    private boolean getConditionFor2() {
        return false;
    }
    
    private boolean getConditionFor3() {
        return false;
    }

    private boolean getConditionFor4() {
        return false;
    }

    private boolean getConditionFor5() {
        return false;
    }

    private boolean getConditionFor6() {
        return false;
    }
}