class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean alwaysFalse = getAlwaysFalse(); // Method that always returns false
        switch (alwaysFalse) {
            case true:
                System.out.println("This line should never execute");
                break;
            default:
                break;
        }
        return Thread.currentThread().isInterrupted(); // Original bug remains
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}