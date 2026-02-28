class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion();
    }

    private void infiniteRecursion() {
        int value = getValue();
        switch(value) {
            case 1:
                // Unreachable code
                infiniteRecursion();
                break;
            default:
                infiniteRecursion();
        }
    }

    private int getValue() {
        return 2;
    }
}