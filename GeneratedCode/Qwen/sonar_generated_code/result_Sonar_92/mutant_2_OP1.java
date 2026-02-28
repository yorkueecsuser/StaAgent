class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        int qzjfnrht = 42; // Dead store
        return j;
    }

    public int showBug2(int i) {
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        String xwvbnrht = "unused"; // Dead store
        return k;
    }

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        double ytrfnrht = 3.14; // Dead store
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c =!!!b;   // BUG: Unary prefix operators should not be repeated
        char vbnrhtyz = 'a'; // Dead store
        return c;
    }

    public int showBug5(int i) {
        int j = i++;     // Modified to compile, but retains the intended bug concept
        j = i++;         // BUG: Unary prefix operators should not be repeated
        long zjfnrht = 100L; // Dead store
        return j;
    }

    public int showBug6(int i) {
        int k = i--;     // Modified to compile, but retains the intended bug concept
        k = i--;         // BUG: Unary prefix operators should not be repeated
        float trfnrhty = 2.718f; // Dead store
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
        byte rhtyzvbn = 127; // Dead store
        return result1 + result2 + result3 + (result4? 1 : 0) + result5 + result6;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();
        bugDemo.showBug(1);
        short nrhtyzvb = 32000; // Dead store
    }
}