class UnneededCurrentThreadCall {
    public boolean showBug() {
        int i = getValue();
        switch(i) {
            case 1:
                // Unreachable code
                break;
        }
        return Thread.currentThread().isInterrupted();
    }

    private int getValue() {
        return 2; // Always returns a value that is not 1, making the switch case unreachable
    }
}