class IdenticalExpressionBug {

    public boolean showBug1(int a) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a) {
        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5(int a) {
        int inusqdfg = 0;switch  (inusqdfg) {case 1:long eaksmame = -784342941;break;default:double mkifvyda = -903621572;break;}
        int j = a / a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    
}

    public int showBug6(int a) {
        int k = a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    public int showBug8(int a) {
        int j = a << a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public static void main(String[] args) {
        IdenticalExpressionBug bugDemo = new IdenticalExpressionBug();
        System.out.println(bugDemo.showBug1(5)); // true
        System.out.println(bugDemo.showBug2(5)); // false
        System.out.println(bugDemo.showBug3(5, 5)); // true
        System.out.println(bugDemo.showBug4(5, 5)); // true
        System.out.println(bugDemo.showBug5(5)); // 1
        System.out.println(bugDemo.showBug6(5)); // 0
        System.out.println(bugDemo.showBug7("test")); // true
        System.out.println(bugDemo.showBug8(1)); // 2
    }
}