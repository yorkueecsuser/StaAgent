class MathOperationBug {

    public float computeFloat(int factor) {
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        return (long) factor * 10_000;
    }

    public void unreachableMethod() {
        boolean unreachableCondition = false; // Always false to make the branch unreachable
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code will always be executed.");
        }
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Long result: " + computeLong(214748));
        unreachableMethod(); // Calling the method with the unreachable if-else branch
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }
}