import java.util.HashMap;

class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        if (getCondition()) {
            return x * y;
        } else {
            return 0;
        }
    }

    private boolean getCondition() {
        return false;
    }
}