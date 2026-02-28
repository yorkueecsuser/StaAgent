class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;

        boolean condition = false;
        int value = getValue();

        if (condition) {
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }
        return i;
    }

    private int getValue() {
        // For the sake of this example, we'll return a constant value
        // In a real-world scenario, this could be a dynamically determined value
        return 0;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}