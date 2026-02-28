import com.facebook.infer.annotation.*;

class Main {

    @SuppressLint("INVARIANT_CALL")
    public int foo(int x, int y) {
        return x + y;
    }

    public void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable
        }
    }

    public int showBug(int size) {
        invariant_hoist(size);
        return foo(10, 5);

        boolean condition = true;
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // This will be reachable code
            System.out.println("This is reachable code.");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug(10);
    }
}