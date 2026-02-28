class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // unreachable code
                break;
        }
        return i;
    }

    private int getUnreachableValue() {
        return 2; // This value will always be unreachable in the switch statement
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}