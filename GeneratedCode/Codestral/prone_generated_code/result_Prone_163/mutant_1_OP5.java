class ThrowNullBug {
    public void showBug() {
        throw null; // BUG: ThrowNull
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();

        // Mutant Code - Unreachable switch statement
        int value = 0; // This value will always be 0, making the switch unreachable
        if (getFalseCondition()) {
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
    }
}