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

    // Inserted unreachable while loop
    private int unreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) {
            // code that is unreachable
            System.out.println("This is unreachable code");
        }
        return 0;
    }
}