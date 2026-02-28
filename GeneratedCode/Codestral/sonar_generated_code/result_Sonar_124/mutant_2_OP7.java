class MathOperationBug {

    public float computeFloat(int factor) {
        boolean unreachable = false;
        while (unreachable) {
            System.out.println("This is an unreachable while loop");
        }
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        if (false) {
            System.out.println("This is an unreachable if statement");
        } else {
            return (long) factor * 10_000;
        }
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