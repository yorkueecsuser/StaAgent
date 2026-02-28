class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            j = j + 1; // This will never execute because condition is always false
        } else {
            j = j - 1; // This will also never execute because condition is always false
        }
        return j;
    }

    public int showBug2(int i) {
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            k = k + 1; // This will never execute because condition is always false
        } else {
            k = k - 1; // This will also never execute because condition is always false
        }
        return k;
    }

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            m = m + 1; // This will never execute because condition is always false
        } else {
            m = m - 1; // This will also never execute because condition is always false
        }
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c =!!!b;   // BUG: Unary prefix operators should not be repeated
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            c =!c; // This will never execute because condition is always false
        } else {
            c =!c; // This will also never execute because condition is always false
        }
        return c;
    }

    public int showBug5(int i) {
        int j = i++;     // Modified to compile, but retains the intended bug concept
        j = i++;         // BUG: Unary prefix operators should not be repeated
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            j = j + 1; // This will never execute because condition is always false
        } else {
            j = j - 1; // This will also never execute because condition is always false
        }
        return j;
    }

    public int showBug6(int i) {
        int k = i--;     // Modified to compile, but retains the intended bug concept
        k = i--;         // BUG: Unary prefix operators should not be repeated
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            k = k + 1; // This will never execute because condition is always false
        } else {
            k = k - 1; // This will also never execute because condition is always false
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
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            result1 = result1 + 1; // This will never execute because condition is always false
        } else {
            result1 = result1 - 1; // This will also never execute because condition is always false
        }
        return result1 + result2 + result3 + (result4? 1 : 0) + result5 + result6;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        bugDemo.showBug(1);
    }
}