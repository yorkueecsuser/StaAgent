class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        int j_mutant = - - -i;  // Mutant: Duplicate assignment statement
        return j;
    }

    public int showBug2(int i) {
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        int k_mutant = ~~~i;    // Mutant: Duplicate assignment statement
        return k;
    }

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        int m_mutant = + +i;    // Mutant: Duplicate assignment statement
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c =!!!b;   // BUG: Unary prefix operators should not be repeated
        boolean c_mutant =!!!b;   // Mutant: Duplicate assignment statement
        return c;
    }

    public int showBug5(int i) {
        int j = i++;     // Modified to compile, but retains the intended bug concept
        int j_mutant = i++;     // Mutant: Duplicate assignment statement
        j = i++;         // BUG: Unary prefix operators should not be repeated
        int j_mutant2 = i++;    // Mutant: Duplicate assignment statement
        return j;
    }

    public int showBug6(int i) {
        int k = i--;     // Modified to compile, but retains the intended bug concept
        int k_mutant = i--;     // Mutant: Duplicate assignment statement
        k = i--;         // BUG: Unary prefix operators should not be repeated
        int k_mutant2 = i--;    // Mutant: Duplicate assignment statement
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
        return result1 + result2 + result3 + (result4? 1 : 0) + result5 + result6;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        bugDemo.showBug(1);
    }
}