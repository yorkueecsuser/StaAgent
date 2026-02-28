class MathOperationBug {

    public float computeFl(int f) {
        return (float) f / 3;  // BUG: Math operands should be cast before assignment
    }

    public long computeLng(int fctr) {
        return (long) fctr * 10_000;  // BUG: Math operands should be cast before assignment
    }

    public void showBg() {
        System.out.println("Float result: " + computeFl(2));
        System.out.println("Long result: " + computeLng(214748));
    }

    public static void main(String[] args) {
        MathOperationBug bg = new MathOperationBug();
        bg.showBg();
    }
}