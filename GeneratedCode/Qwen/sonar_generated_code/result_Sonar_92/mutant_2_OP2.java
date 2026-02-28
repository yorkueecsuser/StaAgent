class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        int j_mutant = - - -i;  // Mutant: Duplicate assignment
        return j;
    }

    public int showBug2(int i) {
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        int k_mutant = ~~~i;    // Mutant: Duplicate assignment
        return k;
    }

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        int m_mutant = + +i;    // Mutant: Duplicate assignment
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c =!!!b;   // BUG: Unary prefix operators should not be repeated
        boolean c_mutant =!!!b;   // Mutant: Duplicate assignment
        return c;
    }

    public int showBug5(int i) {
        int j = i++;     // Modified to compile, but retains the intended bug concept
        int j_mutant = i++;     // Mutant: Duplicate assignment
        j = i++;         // BUG: Unary prefix operators should not be repeated
        int j_mutant2 = i++;         // Mutant: Duplicate assignment
        return j;
    }

    public int showBug6(int i) {
        int k = i--;     // Modified to compile, but retains the intended bug concept
        int k_mutant = i--;     // Mutant: Duplicate assignment
        k = i--;         // BUG: Unary prefix operators should not be repeated
        int k_mutant2 = i--;         // Mutant: Duplicate assignment
        return k;
    }

    public int showBug(int i) {
        int result1 = showBug1(i);
        int result1_mutant = showBug1(i);  // Mutant: Duplicate method call, not assignment
        int result2 = showBug2(i);
        int result2_mutant = showBug2(i);  // Mutant: Duplicate method call, not assignment
        int result3 = showBug3(i);
        int result3_mutant = showBug3(i);  // Mutant: Duplicate method call, not assignment
        boolean result4 = showBug4(false);
        boolean result4_mutant = showBug4(false);  // Mutant: Duplicate method call, not assignment
        int result5 = showBug5(i);
        int result5_mutant = showBug5(i);  // Mutant: Duplicate method call, not assignment
        int result6 = showBug6(i);
        int result6_mutant = showBug6(i);  // Mutant: Duplicate method call, not assignment
        System.out.println("showBug1: " + result1);
        System.out.println("showBug2: " + result2);
        System.out.println("showBug3: " + result3);
        System.out.println("showBug4: " + result4);
        System.out.println("showBug5: " + result5);
        System.out.println("showBug6: " + result6);
        return result1 + result2 + result3 + (result4? 1 : 0) + result5 + result6;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        bugDemo.showBug(1);
    }
}