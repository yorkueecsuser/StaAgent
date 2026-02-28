@ThreadSafe(enableChecks = true)
class Buggy {
    @ThreadConfined(UI)
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    @UiThread
    public int getX() {
        return x;
    }

    public void showBug() {
        int y = 0;
        y = getX();
        setX(y);
    }

    // Unreachable if-else statement
    private boolean shouldRun = getCondition();
    if (shouldRun) {
        // code
    } else {
        // alternative code
    }
}