import java.util.HashMap;

class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        return x * y;
    }

    // Inserted unreachable switch statement
    private int getValue() {
        return 0;
    }

    public void unreachableSwitch() {
        int value = getValue();
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable code");
                break;
            default:
                // Unreachable code
                System.out.println("Unreachable code");
                break;
        }
    }
}