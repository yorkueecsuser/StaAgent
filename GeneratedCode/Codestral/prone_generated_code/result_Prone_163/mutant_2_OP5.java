class ThrowNullBug {
    public void showBug() {
        throw null; // BUG: ThrowNull
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // Unreachable code
                System.out.println("This is unreachable code");
                break;
        }
    }

    private int getUnreachableValue() {
        // This method always returns -1, making the switch statement unreachable
        return -1;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}