class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion();
    }

    private void infiniteRecursion() {
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                // This code is unreachable.
                break;
        }
        infiniteRecursion();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}