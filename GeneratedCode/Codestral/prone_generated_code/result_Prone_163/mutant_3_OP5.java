class ThrowNullBug {
    public boolean getAlwaysFalseCondition() {
        return false;
    }

    public void showBug() {
        throw null; // BUG: ThrowNull
        int value = getValue();
        if (getAlwaysFalseCondition()) {
            switch (value) {
                case 1:
                    // This code is unreachable
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }
    }

    public int getValue() {
        return 0; // This will not match any case in the switch statement, making it unreachable
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}