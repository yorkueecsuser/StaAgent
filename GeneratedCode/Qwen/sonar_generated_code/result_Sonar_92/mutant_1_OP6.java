class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // Unreachable code
        }
        return j;
    }

    public int showBug2(int i) {
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int l = 0; conditionFor; l++) {
            // Unreachable code
        }
        return k;
    }

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int n = 0; conditionFor; n++) {
            // Unreachable code
        }
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c =!!!b;   // BUG: Unary prefix operators should not be repeated
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int o = 0; conditionFor; o++) {
            // Unreachable code
        }
        return c;
    }

    public int showBug5(int i) {
        int j = i++;     // Modified to compile, but retains the intended bug concept
        j = i++;         // BUG: Unary prefix operators should not be repeated
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int p = 0; conditionFor; p++) {
            // Unreachable code
        }
        return j;
    }

    public int showBug6(int i) {
        int k = i--;     // Modified to compile, but retains the intended bug concept
        k = i--;         // BUG: Unary prefix operators should not be repeated
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int q = 0; conditionFor; q++) {
            // Unreachable code
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
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int r = 0; conditionFor; r++) {
            // Unreachable code
        }
        return result1 + result2 + result3 + (result4? 1 : 0) + result5 + result6;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        bugDemo.showBug(1);
    }

    private boolean getCondition() {
        return false; // This method can be modified to return true/false based on runtime logic if needed
    }
}