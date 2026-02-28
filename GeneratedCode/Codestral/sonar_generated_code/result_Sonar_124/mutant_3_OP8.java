class MathOperationBug {

    public float computeFloat(int factor) {
        int f = factor;
        return (float) f / 3;
    }

    public long computeLong(int factor) {
        int fac = factor;
        return (long) fac * 10_000;
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Long result: " + computeLong(214748));
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }
}