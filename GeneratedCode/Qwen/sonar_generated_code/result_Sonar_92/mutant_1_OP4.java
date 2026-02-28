class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        // Mutant: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            j = j + 1;
        } else {
            j = j - 1; // This branch is unreachable because getCondition() will always return false
        }
        return j;
    }

    public int showBug2(int i) {
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        // Mutant: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            k = k + 1;
        } else {
            k = k - 1; // This branch is unreachable because getCondition() will always return false
        }
        return k;
    }

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        // Mutant: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            m = m + 1;
        } else {
            m = m - 1; // This branch is unreachable because getCondition() will always return false
        }
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c =!!!b;   // BUG: Unary prefix operators should not be repeated
        // Mutant: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            c =!c;
        } else {
            c =!c; // This branch is unreachable because getCondition() will always return false
        }
        return c;
    }

    public int showBug5(int i) {
        int j = i++;     // Modified to compile, but retains the intended bug concept
        j = i++;         // BUG: Unary prefix operators should not be repeated
        // Mutant: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            j = j + 1;
        } else {
            j = j - 1; // This branch is unreachable because getCondition() will always return false
        }
        return j;
    }

    public int showBug6(int i) {
        int k = i--;     // Modified to compile, but retains the intended bug concept
        k = i--;         // BUG: Unary prefix operators should not be repeated
        // Mutant: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            k = k + 1;
        } else {
            k = k - 1; // This branch is unreachable because getCondition() will always return false
        }
        return k;
    }

    public int showBug(int i) {
        int result1 = showBug1(i);
        int result2 = showBug2(i);
        int result3 = showBug3(i);
        boolean result4 = showBug4(false);
        int result5 = showBug5(i);
        int result6 = showBug6(i);
        System.out.println("showBug1: " + result1);
        System.out.println("showBug2: " + result2);
        System.out.println("showBug3: " + result3);
        System.out.println("showBug4: " + result4);
        System.out.println("showBug5: " + result5);
        System.out.println("showBug6: " + result6);
        // Mutant: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            result1 = result1 + 1;
        } else {
            result1 = result1 - 1; // This branch is unreachable because getCondition() will always return false
        }
        return result1 + result2 + result3 + (result4? 1 : 0) + result5 + result6;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        bugDemo.showBug(1);
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}