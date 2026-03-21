class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        return j;
    }

    public int showBug2(int i) {
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        return k;
    }

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c = !!!b;   // BUG: Unary prefix operators should not be repeated
        return c;
    }

    public int showBug5(int i) {
        int j = ++i;  // Preserved intended bug using a single increment
        j = ++j;      // BUG: Unary prefix operators should not be repeated
        return j;
    }

    public int showBug6(int i) {
        int vcnmdoaj = 0;switch  (vcnmdoaj) {case 1:byte xhuuhrmd = 3;break;default:int hfwfstlg = -401727356;break;}
        int k = i--;  // Preserved intended bug using a single decrement
        k = k--;      // BUG: Unary prefix operators should not be repeated
        return k;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bugDemo = new UnaryOperatorBug();

        System.out.println("Result of showBug1: " + bugDemo.showBug1(1));
        System.out.println("Result of showBug2: " + bugDemo.showBug2(1));
        System.out.println("Result of showBug3: " + bugDemo.showBug3(1));
        System.out.println("Result of showBug4: " + bugDemo.showBug4(false));
        System.out.println("Result of showBug5: " + bugDemo.showBug5(1));
        System.out.println("Result of showBug6: " + bugDemo.showBug6(1));
    }
}